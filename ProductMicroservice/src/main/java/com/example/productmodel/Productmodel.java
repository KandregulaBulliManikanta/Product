package com.example.productmodel;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Productdatabase")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class Productmodel {
    private int productId;
    private int productname;
    private int productquantity;
    private int productprice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductname() {
		return productname;
	}
	public void setProductname(int productname) {
		this.productname = productname;
	}
	public int getProductquantity() {
		return productquantity;
	}
	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}


}
