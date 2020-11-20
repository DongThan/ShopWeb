<%-- 
    Document   : product-details
    Created on : Nov 20, 2020, 8:58:55 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Detail - DONG Store</title>
    <link rel="stylesheet" href="css/style.css">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
    <div class="container">
        <div class="navbar">
                <div class="gogo">
                    <img src="images/logo.png" width="125px" alt="">
                </div>
                <nav>
                    <ul id="MenuItems">
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="products.jsp">Products</a></li>
                        <li><a href="">About</a></li>
                        <li><a href="">Blog</a></li>
                        <li><a href="">Account</a></li>
                        <li><a href="" class="btn-login">Log In</a></li>
                        <li><a href="" class="btn-register">Register</a></li>
                    </ul>
                </nav>
                <a href="cart.jsp"><img src="images/cart.png" width="30px" height="30px" class="imgcard"></a>
                <img src="images/menu.png" class="menu-icon" onclick="menutoggle()">
            </div>
    </div>
    <!-- Single product details -->
    <div class="small-container single-product">
        <div class="row">
            <div class="col-2">
                <img src="images/prd6.jpg" width="100%">
            </div>
            <div class="col-2">
                <p>Home / Dược liệu</p>
                <h1>Cam thảo sấy khô</h1>
                <h4>500.000 Đồng/kg</h4>
                <input type="number" value="1">
                <select>
                    <option value="">Đơn vị</option>
                    <option value="">Kg</option>
                    <option value="">Tạ</option>
                </select>
                <a href="" class="btn">Thêm vào giỏ hàng</a>
                <h3>Product Details <i class="fa fa-indent" ></i></h3>
                <h4>Product Decription ở chỗ này nha. Lorem ipsum dolor, sit amet consectetur adipisicing elit. Repellat nostrum neque doloribus placeat perferendis nemo molestiae dignissimos. Quaerat, architecto natus!</h4>
            </div>
        </div>
    </div>
    <!------- view more ------>
    <div class="small-container">
        <div class="row row-2">
            <h2>Related Products</h2>
            <p>View more</p>
        </div>
    </div>
    <div class="small-container">
        <div class="row">
            <div class="col-4">
                <img src="images/prd4.jpg" alt="">
                <div class="overlay">
                    <input type="button" value="Thêm vào giỏ hàng" class="btn">
                </div>
                <h4>Thuốc A</h4>
                <div class="rating">
                    <i class="fa fa-star" ></i>
                    <i class="fa fa-star" ></i>
                    <i class="fa fa-star" ></i>
                    <i class="fa fa-star" ></i>
                    <i class="fa fa-star-o" ></i>
                </div>
                <p>$50.00</p>
            </div>
            <div class="col-4">
                <img src="images/prd5.jpg" alt="">
                <div class="overlay">
                    <input type="button" value="Thêm vào giỏ hàng" class="btn">
                </div>
                <h4>Thuốc A</h4>
                <div class="rating">
                    <i class="fa fa-star" ></i>
                    <i class="fa fa-star" ></i>
                    <i class="fa fa-star" ></i>
                    <i class="fa fa-star" ></i>
                    <i class="fa fa-star-o" ></i>
                </div>
                <p>$50.00</p>
            </div>
            <div class="col-4">
                <img src="images/prd6.jpg" alt="">
                <div class="overlay">
                    <input type="button" value="Thêm vào giỏ hàng" class="btn">
                </div>
                <h4>Thuốc A</h4>
                <div class="rating">
                    <i class="fa fa-star" ></i>
                    <i class="fa fa-star" ></i>
                    <i class="fa fa-star" ></i>
                    <i class="fa fa-star" ></i>
                    <i class="fa fa-star-o" ></i>
                </div>
                <p>$50.00</p>
            </div>
            <div class="col-4">
                <img src="images/prd7.jpg" alt="">
                <div class="overlay">
                    <input type="button" value="Thêm vào giỏ hàng" class="btn">
                </div>
                <h4>Thuốc A</h4>
                <div class="rating">
                    <i class="fa fa-star" ></i>
                    <i class="fa fa-star" ></i>
                    <i class="fa fa-star" ></i>
                    <i class="fa fa-star-half-o" ></i>
                    <i class="fa fa-star-o" ></i>
                </div>
                <p>$50.00</p>
            </div>
        </div>
    </div>
    <!--------- footer  --------->
    <div class="footer">
        <div class="container">
            <div class="row">
                <div class="footer-col-1">
                    <h3>Dowload Our App</h3>
                    <p>Download App for Android and ios mobie phone</p>
                    <div class="app-logo">
                        <img src="images/playstore.png" alt="">
                        <img src="images/appstore.png" alt="">
                    </div>
                </div>
                <div class="footer-col-2">
                    <img src="images/logo4.png" alt="">
                    <p>Our Purpose Is To Sustainably Make the Pleasure and
                        Benefits of Sports Accessible to the Many
                    </p>

                </div>
                <div class="footer-col-3">
                    <h3>Userful Links</h3>
                    <ul>
                        <li>Khoa Phan</li>
                        <li>Minh Mâm</li>
                        <li>Đông Thân</li>
                        <li>Nhật Minh</li>
                    </ul>
                </div>
                <div class="footer-col-3">
                    <h3>Follow us</h3>
                    <ul>
                        <li>Coupns</li>
                        <li>Blog Post</li>
                        <li>Instagram</li>
                        <li>Youtube</li>
                    </ul>
                </div>
            </div>
            <hr>
            <p class="copyright">Copyright 2020 - DongThan</p>
        </div>
    </div>
    <!---- Toggle Menu ------>
    <script>
        var MenuItems = document.getElementById("MenuItems");
        MenuItems.style.maxHeight="0px";
        function menutoggle(){
            if(MenuItems.style.maxHeight=="0px")
            {
                MenuItems.style.maxHeight="250px"
            }
            else
            {
                MenuItems.style.maxHeight="0px"
            }
        }
    </script>
</body>
</html>