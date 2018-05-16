package com.anaroja.ProductCategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anaroja.ProductCategories.models.CategoryModel;
import com.anaroja.ProductCategories.models.ProductModel;
import com.anaroja.ProductCategories.services.CategoryService;
import com.anaroja.ProductCategories.services.ProductService;

@Controller
public class controller {

	private final CategoryService categoryService;
	private final ProductService productService;
	public controller(CategoryService categoryService, ProductService productService) {
		this.categoryService = categoryService;
		this.productService = productService;
	}
	
	//Product
	@RequestMapping ("/")
	public String index() {
		return "redirect:/product/new";
	}

	@RequestMapping ("/product/new")
	public String newProduct(@ModelAttribute("product") ProductModel product) {
		return "newproduct.jsp";
	}
	
	@PostMapping ("/product/new")
	public String createProduct(@Valid @ModelAttribute("product") ProductModel product, BindingResult result) {
		if (result.hasErrors()) {
			return "newproduct.jsp";
		}else {
			productService.addProduct(product);
			return "redirect:/category/new";
		}
    }
	
	@RequestMapping ("/product/{id}")
	public String showProduct (@PathVariable ("id") Long id, Model m) {
		m.addAttribute("product", productService.findById(id));
		m.addAttribute("categories", categoryService.findAll());
		return "products.jsp";
	}
	
	@PostMapping("/product/{id}/add")
	public String addCategory (@PathVariable ("id") Long id, @RequestParam("categories") Long cId) {
		ProductModel prod = productService.findById(id);
		CategoryModel cat = categoryService.findById(cId);
		categoryService.updateCategories(prod,cat);
		return "redirect:/product/"+id;
	}
	
	//Category
	
	@RequestMapping ("/category/new")
	public String newNinja(@ModelAttribute ("category") CategoryModel category) {
		return "newcategory.jsp";
	}
	
	@PostMapping ("/category/new")
	public String createNinja(@Valid @ModelAttribute("category") CategoryModel category, BindingResult result) {
		if (result.hasErrors()) {
			return "newcategory.jsp";
		}else {
			categoryService.addCategory(category);
			return "redirect:/product/new";
		}
    }
	
	@RequestMapping ("/category/{id}")
	public String showCategory (@PathVariable ("id") Long id, Model m) {
		m.addAttribute("products", productService.findAll());
		m.addAttribute("category", categoryService.findById(id));
		return "categories.jsp";
	}
	
	@PostMapping("/category/{id}/add")
	public String addProduct (@PathVariable ("id") Long id, @RequestParam("product") Long pId) {
		ProductModel prod = productService.findById(pId);
		CategoryModel cat = categoryService.findById(id);
		categoryService.updateCategories(prod,cat);
		return "redirect:/category/"+id;
	}
	
}
