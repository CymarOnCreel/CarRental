CREATE SCHEMA `car_rental` DEFAULT CHARACTER SET utf8 COLLATE utf8_hungarian_ci ;

CREATE TABLE `car_rental`.`users` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `UserName` VARCHAR(50) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `isDeleted` TINYINT NOT NULL DEFAULT 0,
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `user_id_UNIQUE` (`user_id` ASC) ,
  UNIQUE INDEX `UserName_UNIQUE` (`UserName` ASC) ,
  UNIQUE INDEX `password_UNIQUE` (`password` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_hungarian_ci;

CREATE TABLE `car_rental`.`roles` (
  `role_id` INT NOT NULL AUTO_INCREMENT,
  `role_name` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`role_id`),
  UNIQUE INDEX `role_id_UNIQUE` (`role_id` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_hungarian_ci;

CREATE TABLE `car_rental`.`user_roles` (
  `user_id` INT NOT NULL,
  `role_id` INT NOT NULL,
  PRIMARY KEY (`user_id`, `role_id`),
  INDEX `role_id_idx` (`role_id` ASC) ,
  CONSTRAINT `user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `car_rental`.`users` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `role_id`
    FOREIGN KEY (`role_id`)
    REFERENCES `car_rental`.`roles` (`role_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_hungarian_ci;

CREATE TABLE `car_rental`.`user_contacts` (
    user_id INT,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    phone_number VARCHAR(15) NOT NULL,
    email VARCHAR(100) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES Users (user_id)
);

CREATE TABLE `car_rental`.`user_address`(
    address_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    invoice_zipcode VARCHAR(10) NOT NULL,
    invoice_city VARCHAR(50) NOT NULL,
    invoice_state VARCHAR(50) NOT NULL,
    invoice_address VARCHAR(255) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE `car_rental`.`delivery_address` (
    address_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    delivery_zipcode VARCHAR(10) NOT NULL,
    delivery_city VARCHAR(50) NOT NULL,
    delivery_state VARCHAR(50) NOT NULL,
    delivery_address VARCHAR(255) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);
CREATE TABLE `car_rental`.`brands` (
    brand_id INT AUTO_INCREMENT PRIMARY KEY,
    brand_name VARCHAR(50) NOT NULL
);

CREATE TABLE `car_rental`.`colors` (
    color_id INT AUTO_INCREMENT PRIMARY KEY,
    color_name VARCHAR(20) NOT NULL
);

CREATE TABLE `car_rental`.`fuelTypes` (
    fuel_type_id INT AUTO_INCREMENT PRIMARY KEY,
    fuel_type_name VARCHAR(20) NOT NULL
);

CREATE TABLE `car_rental`.`cars` (
    car_id INT AUTO_INCREMENT PRIMARY KEY,
    brand_id INT,
    type VARCHAR(50) NOT NULL,
    color_id INT,
    passenger_seats INT NOT NULL,
    fuel_type_id INT,
    price_per_day DECIMAL(10, 2) NOT NULL,
    is_available BOOLEAN NOT NULL,
    FOREIGN KEY (brand_id) REFERENCES Brands (brand_id),
    FOREIGN KEY (color_id) REFERENCES Colors (color_id),
    FOREIGN KEY (fuel_type_id) REFERENCES FuelTypes (fuel_type_id)
);
CREATE TABLE `car_rental`.`rentals` (
    `rental_id` INT AUTO_INCREMENT PRIMARY KEY,
    `user_id` INT NOT NULL,
    `salesman_id` INT NOT NULL,
    `car_id` INT NOT NULL,
    `start_date` DATETIME NOT NULL,
    `end_date` DATETIME NOT NULL,
    FOREIGN KEY (`user_id`) REFERENCES `car_rental`.`users` (`user_id`),
    FOREIGN KEY (`salesman_id`) REFERENCES `car_rental`.`users` (`user_id`),
    FOREIGN KEY (`car_id`) REFERENCES `car_rental`.`cars` (`car_id`)
) ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8
  COLLATE = utf8_hungarian_ci;