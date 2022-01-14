package org.springframework.samples.petclinic.product;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "products")
public class Product extends BaseEntity{
    Integer id;
    @Size(min = 3, max = 50)
    @NotNull
    String name;
    @NotNull
    @Min(0)
    double price;
    @ManyToOne
    @JoinColumn(name = "product_type_id")
    ProductType productType;
}
