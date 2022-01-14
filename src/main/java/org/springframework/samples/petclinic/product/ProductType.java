package org.springframework.samples.petclinic.product;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "product_types")
public class ProductType extends BaseEntity{
    Integer id;
    @Size(min = 3, max = 50)
    @NotNull
    @Column(unique=true)
    String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productType")
    List<Product> products;
}
