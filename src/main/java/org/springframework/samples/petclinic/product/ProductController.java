package org.springframework.samples.petclinic.product;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    
	@Autowired
	private ProductService productService;
	
	@GetMapping(path = "/create")
	public String initProduct(ModelMap modelMap) {
		Product product = new Product();
		List<ProductType> productTypes = productService.getAllProductTypes();
		String view = "products/createOrUpdateProductForm";
		modelMap.addAttribute("productTypes", productTypes);
		modelMap.addAttribute("product", product);
		return view;

	}
	
	@PostMapping(path = "/create")
	public String processProduct(@Valid Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "products/createOrUpdateProductForm";
		}else {
			productService.save(product);
			return "welcome";
		}

	}
	
}
