package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

@RestController
@RequestMapping(value="/api/products") // Ex: bycati.io/api/products
public class ProductsController {
	
	private ProductService productService;
	
	@Autowired 
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll() {
		return this.productService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
		
	}
	
	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(@RequestParam String productName) {
		return this.productService.getByProductName(productName);
	}
	@GetMapping("/getByProductNameAndCategory")
	public DataResult<Product> getByProductNameAndCategory(@RequestParam String productName, @RequestParam int categoryId) {
		return this.productService.getByProductNameAndCategoryId(productName, categoryId);
	}
	@GetMapping("/getByProductNameContains")
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return this.productService.getByProductNameContains(productName);
	}
	
	@GetMapping("/getAllByPage")
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		return this.productService.getAll(pageNo, pageSize);
	}
	
	@GetMapping("/getAllBySortedAZ")
	public DataResult<List<Product>> getAllSortedAsc(String fieldName) {
		return this.productService.getAllSortedAsc(fieldName);
	}
	
	@GetMapping("/getAllBySortedZA")
	public DataResult<List<Product>> getAllSortedDesc(String fieldName) {
		return this.productService.getAllSortedDesc(fieldName);
	}
	
	@GetMapping("/getByProductNameOrCategoryId")
	public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
		return this.productService.getByProductNameOrCategoryId(productName, categoryId);
	}
/*	@GetMapping("/getByCategoryIn")
	public DataResult<List<Product>> getByCategoryIn(List<Integer> categories){
		return this.productService.getByCategoryIn(categories);
	}  */
	
	@GetMapping("/getByProductWithCategoryDetails")
	public DataResult<List<ProductWithCategoryDto>> getByProductWithCategoryDetails(){
		return this.productService.getProductWithCategoryDetails();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
