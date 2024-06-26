package pl.slawek.inventroryservice;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventroryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventroryServiceApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
//		return args -> {
//			Inventory inventory = new Inventory();
//			inventory.setSkuCode("telefon");
//			inventory.setQuantity(100);
//
//			Inventory inventory2 = new Inventory();
//			inventory2.setSkuCode("Tablet");
//			inventory2.setQuantity(0);
//
//			inventoryRepository.save(inventory);
//			inventoryRepository.save(inventory2);
//		};
//	}

}
