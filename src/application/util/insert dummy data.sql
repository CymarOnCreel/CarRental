-- Inserting dummy data into users table
INSERT INTO `car_rental`.`users` (`UserName`, `password`) VALUES
('john_doe', 'password123'),
('jane_smith', 'securepassword'),
('admin_user', 'adminpass');

-- Inserting dummy data into roles table
INSERT INTO `car_rental`.`roles` (`role_name`) VALUES
('Regular User'),
('Salesman'),
('Admin');

-- Assigning roles to users
INSERT INTO `car_rental`.`user_roles` (`user_id`, `role_id`) VALUES
(1, 1), -- John Doe is a regular user
(2, 2), -- Jane Smith is a salesman
(3, 3); -- Admin user has an admin role

-- Inserting dummy data into user_contacts table
INSERT INTO `car_rental`.`user_contacts` (`user_id`, `first_name`, `last_name`, `phone_number`, `email`) VALUES
(1, 'John', 'Doe', '123-456-7890', 'john.doe@example.com'),
(2, 'Jane', 'Smith', '987-654-3210', 'jane.smith@example.com'),
(3, 'Admin', 'User', '555-555-5555', 'admin.user@example.com');

-- Inserting dummy data into user_address table
INSERT INTO `car_rental`.`user_address` (`user_id`, `invoice_zipcode`, `invoice_city`, `invoice_state`, `invoice_address`) VALUES
(1, '12345', 'City1', 'State1', '123 Main St'),
(2, '54321', 'City2', 'State2', '456 Oak St'),
(3, '55555', 'AdminCity', 'AdminState', '789 Pine St');

-- Inserting dummy data into delivery_address table
INSERT INTO `car_rental`.`delivery_address` (`user_id`, `delivery_zipcode`, `delivery_city`, `delivery_state`, `delivery_address`) VALUES
(1, '54321', 'City2', 'State2', '456 Oak St'),
(2, '12345', 'City1', 'State1', '123 Main St'),
(3, '55555', 'AdminCity', 'AdminState', '789 Pine St');

-- Inserting dummy data into brands table
INSERT INTO `car_rental`.`brands` (`brand_name`) VALUES
('Toyota'),
('Honda'),
('Ford');

-- Inserting dummy data into colors table
INSERT INTO `car_rental`.`colors` (`color_name`) VALUES
('Red'),
('Blue'),
('Green');

-- Inserting dummy data into fuelTypes table
INSERT INTO `car_rental`.`fuelTypes` (`fuel_type_name`) VALUES
('Gasoline'),
('Diesel'),
('Electric');

-- Inserting dummy data into cars table
INSERT INTO `car_rental`.`cars` (`brand_id`, `type`, `color_id`, `passenger_seats`, `fuel_type_id`, `price_per_day`, `is_available`) VALUES
(1, 'Sedan', 1, 5, 1, 50.00, 1),
(2, 'SUV', 2, 7, 2, 70.00, 1),
(3, 'Hatchback', 3, 5, 3, 60.00, 1);

-- Inserting dummy data into rentals table
INSERT INTO `car_rental`.`rentals` (`user_id`, `salesman_id`, `car_id`, `start_date`, `end_date`) VALUES
(1, 3, 1, '2023-01-01 08:00:00', '2023-01-03 18:00:00'),
(2, 3, 2, '2023-02-01 10:00:00', '2023-02-05 15:00:00'),
(3, 3, 3, '2023-03-01 12:00:00', '2023-03-07 20:00:00');
