package com.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.serviceCaller.ProductService;
import com.userInputValues.Product;

import antlr.collections.List;

@Controller
public class controller {
	@Autowired
	ProductService productService = new ProductService();

	@RequestMapping("/")
	public String introPage(Model model) {
		ArrayList product = (ArrayList) this.productService.allData();
		// List product=(List) this.productService.allData();
		System.out.println(product);
		model.addAttribute("title", "Intro Page");
		model.addAttribute("productList", product);
		return "IntroPage";
	}

	@RequestMapping("addProduct")
	public String addProduct(Model model) {
		model.addAttribute("title", "Add Product");
		return "addProduct";
	}

	@RequestMapping("SubmitPage")
	public String submitPage(Model model) {
		model.addAttribute("title", "Sucess");
		return "SubmitPage";
	}

	@RequestMapping("update_product")
	public String updatePageView(Model model) {
		//model.addAttribute("title", "Update Page");
		return "update_product";
	}

	@RequestMapping(path = "/IntroPage")
	public RedirectView moveToAddProduct(Model model, HttpServletRequest request) {
		RedirectView view = new RedirectView();
		view.setUrl(request.getContextPath() + "/");
		model.addAttribute("title", "Add Product");
		// return "addProduct";
		return view;
	}

	@RequestMapping(value = "/addProductForm", method = RequestMethod.POST)
	public RedirectView addProductDetailsToDb(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println(product);
		this.productService.inserProductDetails(product);
		System.out.println("after service");
		RedirectView view = new RedirectView();
		view.setUrl(request.getContextPath() + "/addProduct");
		return view;
	}

	@RequestMapping("/delete_product/{productId}")
	public RedirectView deleteEntry(@PathVariable("productId") int productId, HttpServletRequest request) {
		this.productService.deleteEntry(productId);
		RedirectView view = new RedirectView();
		view.setUrl(request.getContextPath() + "/");
		return view;
	}

	@RequestMapping("/update_product/{productId}")
	public String updateEntry(@PathVariable("productId") int productId, HttpServletRequest request, Model model) {
		//RedirectView view = new RedirectView();
		//view.setUrl(request.getContextPath() + "/update_product");
		//ModelAndView view = new ModelAndView();
		//view.setViewName("update_product");
		Product product = new Product();
		product = this.productService.getSingleEntry(productId);
		//String name=product.getNAME();
		//String description = product.getDESCRIPTION();
		//Long price = product.getPRICE();
		//System.out.println(name);
		//view.addObject("name", name);
		//view.addObject("description", description);
		//view.addObject("price", price);
		//view.addObject("product",product);
		/* model.addAttribute("name",product.getNAME()); 
		 model.addAttribute("description",product.getDESCRIPTION());
		 model.addAttribute("price",product.getPRICE());*/
		 model.addAttribute("title", "Update page");		 
		 model.addAttribute("product",product);
		//System.out.println(product);
		return "update_product";
	}
	
	@RequestMapping(value="/updateProduct", method=RequestMethod.POST)
	public RedirectView updateDataEntry(@ModelAttribute Product product, HttpServletRequest request ) {
		this.productService.inserProductDetails(product);
		RedirectView view = new RedirectView();
		view.setUrl(request.getContextPath()+"/");
		return view;	
	}

	
}
