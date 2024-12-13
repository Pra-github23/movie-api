<?php include 'connect.php'; ?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dp Renewable Energy</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <header>
        <div class="container">
            <h1>Dp Renewable Energy</h1>
            <nav>
                <ul>
                    <li><a href="#about">About</a></li>
                    <li><a href="#services">Services</a></li>
                    <li><a href="#contact">Contact</a></li>
                </ul>
            </nav>
        </div>
    </header>


    <main>
        <section id="about">
            <div class="container">
                <h2>About Us</h2>
                <div class="about-content">
                    <img src="image/renewable-energy.jpeg" alt="Renewable Energy" class="about-img">
                    <p>At DP Renewable Energy, we are committed to providing innovative and sustainable energy solutions to power a greener future. Our mission is to harness renewable resources efficiently and responsibly.</p>
                </div>
            </div>
        </section>
        <section id="services">
            <div class="container">
                <h2>Our Services</h2>
                <div class="service-list">
                    <div class="service-item">
                        <img src="image/solar-panel.jpeg" alt="Solar Panel" class="service-img">
                        <h3>Solar Panel Installation</h3>
                        <p>We provide professional solar panel installation services, ensuring maximum efficiency and performance for residential and commercial properties.</p>
                    </div>
                    <div class="service-item">
                        <img src="image/wind-turbine.jpeg" alt="Wind Turbine" class="service-img">
                        <h3>Wind Turbine Solutions</h3>
                        <p>Our wind turbine solutions offer sustainable energy alternatives that help reduce reliance on non-renewable resources.</p>
                    </div>
                    <div class="service-item">
                        <img src="image/energy-consulting.jpeg" alt="Energy Consulting" class="service-img">
                        <h3>Energy Consulting</h3>
                        <p>We provide expert energy consulting to optimize energy use and reduce costs for businesses and homes.</p>
                    </div>
                    <div class="service-item">
                        <img src="image/battery-storage.jpeg" alt="Battery Storage" class="service-img">
                        <h3>Battery Storage Systems</h3>
                        <p>Our battery storage systems ensure your renewable energy is stored efficiently for later use, improving energy resilience.</p>
                    </div>
                </div>
            </div>
        </section>

        <section id="contact">
            <div class="container">
                <h2>Contact Us</h2>
                <form action="contact_process.php" method="POST">
                    <label for="name">Name:</label>
                    <input type="text" id="name" name="name" required>
                    <label for="email">Email:</label>
                    <input type="email" id="email" name="email" required>
                    <label for="message">Message:</label>
                    <textarea id="message" name="message" rows="5" required></textarea>
                    <button type="submit">Submit</button>
                </form>
            </div>
        </section>
    </main>
    
    <footer>
        <div class="container">
            <p>&copy; 2024 Windora Renewable Energy. All Rights Reserved.</p>
        </div>
    </footer>
</body>
</html>
