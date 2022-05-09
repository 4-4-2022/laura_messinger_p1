package com.lauramessinger.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lauramessinger.model.Account;
import com.lauramessinger.model.Case;
import com.lauramessinger.model.Cpu;
import com.lauramessinger.model.CpuCooler;
import com.lauramessinger.model.Gpu;
import com.lauramessinger.model.Memory;
import com.lauramessinger.model.Monitor;
import com.lauramessinger.model.Motherboard;
import com.lauramessinger.model.Os;
import com.lauramessinger.model.Product;
import com.lauramessinger.model.Psu;
import com.lauramessinger.model.Storage;

@RestController
public class ProductController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ProductCommentHandler productCommentHandler;
	
	@GetMapping(value = "/products/all")
	public List<Product> getAll() {	

		ResponseEntity<Product[]> getProducts = restTemplate.getForEntity("http://localhost:8081/products/all", Product[].class);
		
		List<Product> productList = Arrays.asList(getProducts.getBody());
		
		ResponseEntity<Account[]> getAccounts = restTemplate.getForEntity("http://localhost:8082/accounts/all", Account[].class);
		List<Account> accountList = Arrays.asList(getAccounts.getBody());
		productCommentHandler.setProductComments(accountList, productList);
		
		return productList;
		
	}
	
	@GetMapping(value="/products/cases")
	public List<Case> getCases(){
		
		ResponseEntity<Case[]> response = restTemplate.getForEntity("http://localhost:8081/products/cases", Case[].class);
		return Arrays.asList(response.getBody());
		
	}
	
	@GetMapping(value="/products/cpu")
	public List<Cpu> getCpu(){
		
		ResponseEntity<Cpu[]> response = restTemplate.getForEntity("http://localhost:8081/products/cpu", Cpu[].class);
		return Arrays.asList(response.getBody());
		
	}
	
	@GetMapping(value="/products/coolers")
	public List<CpuCooler> getCoolers(){
		
		ResponseEntity<CpuCooler[]> response = restTemplate.getForEntity("http://localhost:8081/products/coolers", CpuCooler[].class);
		return Arrays.asList(response.getBody());
		
	}
	
	@GetMapping(value="/products/gpu")
	public List<Gpu> getGpu(){
		
		ResponseEntity<Gpu[]> response = restTemplate.getForEntity("http://localhost:8081/products/gpu", Gpu[].class);
		return Arrays.asList(response.getBody());
		
	}
	
	@GetMapping(value="/products/memory")
	public List<Memory> getMemory(){
		
		ResponseEntity<Memory[]> response = restTemplate.getForEntity("http://localhost:8081/products/memory", Memory[].class);
		return Arrays.asList(response.getBody());
		
	}
	
	@GetMapping(value="/products/monitors")
	public List<Monitor> getMonitors(){
		
		ResponseEntity<Monitor[]> response = restTemplate.getForEntity("http://localhost:8081/products/monitors", Monitor[].class);
		return Arrays.asList(response.getBody());
		
	}
	
	@GetMapping(value="/products/mobos")
	public List<Motherboard> getMobos(){
		
		ResponseEntity<Motherboard[]> response = restTemplate.getForEntity("http://localhost:8081/products/mobos", Motherboard[].class);
		return Arrays.asList(response.getBody());
		
	}
	
	@GetMapping(value="/products/os")
	public List<Os> getOs(){
		
		ResponseEntity<Os[]> response = restTemplate.getForEntity("http://localhost:8081/products/os", Os[].class);
		return Arrays.asList(response.getBody());
		
	}
	
	@GetMapping(value="/products/psu")
	public List<Psu> getPsu(){
		
		ResponseEntity<Psu[]> response = restTemplate.getForEntity("http://localhost:8081/products/psu", Psu[].class);
		return Arrays.asList(response.getBody());
		
	}
	
	@GetMapping(value="/products/storage")
	public List<Storage> getStorage(){
		
		ResponseEntity<Storage[]> response = restTemplate.getForEntity("http://localhost:8081/products/storage", Storage[].class);
		return Arrays.asList(response.getBody());
		
	}
	
	@GetMapping(value="/products/cases/search")
	public List<Case> findCases(@RequestParam Map<String, String> parameters){
		
		String parameterString = parameters.entrySet().stream().map(p -> p.getKey() + "=" + p.getValue()).reduce((p1, p2) -> p1 + "&" + p2).orElse("");
		
		String url = "http://localhost:8081/products/cases/search?" + parameterString;
		
		Case[] response = restTemplate.getForObject(url,Case[].class);
		
		return Arrays.asList(response);
		
	}
	
	@GetMapping(value="/products/cpu/search")
	public List<Cpu> findCpu(@RequestParam Map<String, String> parameters){
		
		String parameterString = parameters.entrySet().stream().map(p -> p.getKey() + "=" + p.getValue()).reduce((p1, p2) -> p1 + "&" + p2).orElse("");
		
		String url = "http://localhost:8081/products/cpu/search?" + parameterString;
		
		Cpu[] response = restTemplate.getForObject(url,Cpu[].class);
		
		return Arrays.asList(response);
		
	}
	

	@GetMapping(value="/products/coolers/search")
	public List<CpuCooler> findCoolers(@RequestParam Map<String, String> parameters){
		
		String parameterString = parameters.entrySet().stream().map(p -> p.getKey() + "=" + p.getValue()).reduce((p1, p2) -> p1 + "&" + p2).orElse("");
		
		String url = "http://localhost:8081/products/coolers/search?" + parameterString;
		
		CpuCooler[] response = restTemplate.getForObject(url,CpuCooler[].class);
		
		return Arrays.asList(response);
		
	}
	

	@GetMapping(value="/products/gpu/search")
	public List<Gpu> findGpu(@RequestParam Map<String, String> parameters){
		
		String parameterString = parameters.entrySet().stream().map(p -> p.getKey() + "=" + p.getValue()).reduce((p1, p2) -> p1 + "&" + p2).orElse("");
		
		String url = "http://localhost:8081/products/gpu/search?" + parameterString;
		
		Gpu[] response = restTemplate.getForObject(url,Gpu[].class);
		
		return Arrays.asList(response);
		
	}
	

	@GetMapping(value="/products/memory/search")
	public List<Memory> findMemory(@RequestParam Map<String, String> parameters){
		
		String parameterString = parameters.entrySet().stream().map(p -> p.getKey() + "=" + p.getValue()).reduce((p1, p2) -> p1 + "&" + p2).orElse("");
		
		String url = "http://localhost:8081/products/memory/search?" + parameterString;
		
		Memory[] response = restTemplate.getForObject(url,Memory[].class);
		
		return Arrays.asList(response);
		
	}
	

	@GetMapping(value="/products/monitors/search")
	public List<Monitor> findMonitors(@RequestParam Map<String, String> parameters){
		
		String parameterString = parameters.entrySet().stream().map(p -> p.getKey() + "=" + p.getValue()).reduce((p1, p2) -> p1 + "&" + p2).orElse("");
		
		String url = "http://localhost:8081/products/monitors/search?" + parameterString;
		
		Monitor[] response = restTemplate.getForObject(url,Monitor[].class);
		
		return Arrays.asList(response);
		
	}
	

	@GetMapping(value="/products/mobos/search")
	public List<Motherboard> findMobos(@RequestParam Map<String, String> parameters){
		
		String parameterString = parameters.entrySet().stream().map(p -> p.getKey() + "=" + p.getValue()).reduce((p1, p2) -> p1 + "&" + p2).orElse("");
		
		String url = "http://localhost:8081/products/mobos/search?" + parameterString;
		
		Motherboard[] response = restTemplate.getForObject(url,Motherboard[].class);
		
		return Arrays.asList(response);
		
	}
	

	@GetMapping(value="/products/os/search")
	public List<Os> findOs(@RequestParam Map<String, String> parameters){
		
		String parameterString = parameters.entrySet().stream().map(p -> p.getKey() + "=" + p.getValue()).reduce((p1, p2) -> p1 + "&" + p2).orElse("");
		
		String url = "http://localhost:8081/products/os/search?" + parameterString;
		
		Os[] response = restTemplate.getForObject(url,Os[].class);
		
		return Arrays.asList(response);
		
	}
	

	@GetMapping(value="/products/psu/search")
	public List<Psu> findPsu(@RequestParam Map<String, String> parameters){
		
		String parameterString = parameters.entrySet().stream().map(p -> p.getKey() + "=" + p.getValue()).reduce((p1, p2) -> p1 + "&" + p2).orElse("");
		
		String url = "http://localhost:8081/products/psu/search?" + parameterString;
		
		Psu[] response = restTemplate.getForObject(url,Psu[].class);
		
		return Arrays.asList(response);
		
	}
	

	@GetMapping(value="/products/storage/search")
	public List<Storage> findStorage(@RequestParam Map<String, String> parameters){
		
		String parameterString = parameters.entrySet().stream().map(p -> p.getKey() + "=" + p.getValue()).reduce((p1, p2) -> p1 + "&" + p2).orElse("");
		
		String url = "http://localhost:8081/products/storage/search?" + parameterString;
		
		Storage[] response = restTemplate.getForObject(url,Storage[].class);
		
		return Arrays.asList(response);
		
	}
	
}
