package com.generator.dao.example;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Property;
import de.greenrobot.daogenerator.Schema;

public class DaoGeneratorExample {
	static String nameSchema = "com.generator.dao";
	static int versionSchema = 21;
	static String position = "../ExampleGreenDao/src-gen";
	
	public static void main(String[] args) throws Exception {
		Schema schema = new Schema(versionSchema, nameSchema);
		addEntidades(schema);
		new DaoGenerator().generateAll(schema, position);
	}
	
	private static void addEntidades(Schema schema) {
		Entity promotions = schema.addEntity("Promotions");
		promotions.addIdProperty().autoincrement();
		promotions.addIntProperty("idPromotionDatabase");
		promotions.addStringProperty("imageUrl");
		promotions.addStringProperty("termAndConditions");
		promotions.addStringProperty("couponDescription");
		promotions.addIntProperty("flagAct");
		promotions.addStringProperty("lastUpdate");
		promotions.addStringProperty("couponDescriptionLong");
		promotions.addBooleanProperty("exchangeable");
		promotions.addStringProperty("pathImage");
		promotions.addStringProperty("pathImageBig");
		
		Entity brands = schema.addEntity("Brands");
		brands.addIdProperty().autoincrement();
		brands.addIntProperty("idBrandDatabase");
		brands.addStringProperty("name");
		brands.addStringProperty("imageUrl");
		brands.addStringProperty("lastUpdate");
		brands.addIntProperty("flagAct");
		brands.addStringProperty("color");
		brands.addStringProperty("logoUrl");
		brands.addStringProperty("pathBanner");
		brands.addStringProperty("pathLogos");
		
		Property idBrand = promotions.addLongProperty("idBrand").getProperty();
		brands.addToOne(promotions, idBrand);
		
		Entity companys = schema.addEntity("Companys");
		companys.addIdProperty().autoincrement();
		companys.addIntProperty("idCompanyDatabase");
		companys.addStringProperty("name");
		companys.addStringProperty("imageUrl");
		companys.addStringProperty("lastUpdate");
		companys.addIntProperty("flagAct");
		companys.addStringProperty("logoUrl");
		companys.addStringProperty("pathBanner");
		companys.addStringProperty("pathLogos");
		
		Entity categories = schema.addEntity("Categories");
		categories.addIdProperty().autoincrement();
		categories.addIntProperty("idCategoryDatabase");
		categories.addStringProperty("name");
		categories.addStringProperty("lastUpdate");
		categories.addIntProperty("flagAct");
		
		Property idCategory = companys.addLongProperty("idCategory").getProperty();
		categories.addToOne(companys, idCategory);
		
		Property idCompany = brands.addLongProperty("idCompany").getProperty();
		companys.addToOne(brands, idCompany);
		
		Entity locations = schema.addEntity("Locations");
		locations.addIdProperty().autoincrement();
		locations.addIntProperty("idLocationsDatabase");
		locations.addStringProperty("name");
		locations.addStringProperty("lastUpdate");
		locations.addIntProperty("flagAct");
		locations.addDoubleProperty("latitude");
		locations.addDoubleProperty("longitude");
		locations.addStringProperty("imageUrl");
		
		idBrand = locations.addLongProperty("idBrand").getProperty();
		brands.addToOne(locations, idBrand);
		
		Entity user = schema.addEntity("Users");
		user.addIdProperty().autoincrement();
		user.addIntProperty("idUserDatabase");
		user.addStringProperty("DNI");
		user.addStringProperty("password");
		user.addIntProperty("verifiedDNI");
		user.addIntProperty("flagAct");
		user.addStringProperty("lastUpdate");
		user.addStringProperty("creationTimestamp");
		
		Entity userByBrands = schema.addEntity("UserByBrands");
		userByBrands.addIdProperty().autoincrement();
		userByBrands.addIntProperty("flagAct");
		userByBrands.addStringProperty("lastUpdate");
		
		idBrand = userByBrands.addLongProperty("idBrand").getProperty();
		brands.addToOne(userByBrands, idBrand);
		Property idUser = userByBrands.addLongProperty("idUser").getProperty();
		user.addToOne(userByBrands, idUser);
		
		Entity person = schema.addEntity("Person");
		person.addIdProperty().autoincrement();
		person.addIntProperty("idPersonDatabase");
		person.addStringProperty("name");
		person.addStringProperty("surname");
		person.addStringProperty("facebookId");
		person.addStringProperty("email");
		person.addStringProperty("cellphone");
		person.addStringProperty("imageUrl");
		person.addIntProperty("flagAct");
		person.addStringProperty("lastUpdate");
		person.addStringProperty("creationTimestamp");
		
		Property idPerson = user.addLongProperty("idPerson").getProperty();
		person.addToOne(user, idPerson);
		
		Entity userByPromotions = schema.addEntity("UserByPromotions");
		userByPromotions.addIdProperty().autoincrement();
		userByPromotions.addIntProperty("idUserByPromotionDatabase");
		userByPromotions.addStringProperty("generatedCode");
		userByPromotions.addStringProperty("creationTimestamp");
		userByPromotions.addIntProperty("validMinutes");
		userByPromotions.addIntProperty("flagAct");
		userByPromotions.addStringProperty("lastUpdate");
		
		Property idPromotion = userByPromotions.addLongProperty("idPromotion").getProperty();
		promotions.addToOne(userByPromotions, idPromotion);
		idUser = userByPromotions.addLongProperty("idUser").getProperty();
		user.addToOne(userByPromotions, idUser);
		
		Entity mostUsefulPromotion = schema.addEntity("MostUsefulPromotion");
		mostUsefulPromotion.addIdProperty().autoincrement();
		mostUsefulPromotion.addIntProperty("idMostUsefulPromotionDatabase");
		mostUsefulPromotion.addStringProperty("imageUrl");
		mostUsefulPromotion.addStringProperty("textPromotion");
	}
}
