package com.example.d2darbass;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "productServlet", value = "/product-servlet")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String productName = productService.getProduct(0);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + productName + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String productName = request.getParameter("product");
        productService.addProduct(productName);
    }
}