package com.example.baithuchanh3_tuanduc;


import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    RecyclerView recyclerView;
    ArrayList<Product> products;
    ProductAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerProduct);

        products = new ArrayList<>();

        products.add(new Product("Áo thun nam", "150.000 VNĐ", "Chất vải cotton mềm, thoáng mát"));
        products.add(new Product("Giày thể thao", "650.000 VNĐ", "Thiết kế trẻ trung, đi học và đi chơi đều phù hợp"));
        products.add(new Product("Balo laptop", "420.000 VNĐ", "Có ngăn chống sốc, đựng vừa laptop 15 inch"));
        products.add(new Product("Bình giữ nhiệt", "180.000 VNĐ", "Giữ nóng và lạnh tốt, dung tích 500ml"));
        products.add(new Product("Đèn học LED", "230.000 VNĐ", "Ánh sáng dịu, tiết kiệm điện"));
        products.add(new Product("Sổ tay ghi chú", "45.000 VNĐ", "Bìa cứng, giấy dày, dễ viết"));
        products.add(new Product("Tai nghe có dây", "120.000 VNĐ", "Âm thanh rõ, phù hợp học online"));

        adapter = new ProductAdapter(products);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    class Product {
        String productName;
        String productPrice;
        String productDescription;

        Product(String productName, String productPrice, String productDescription) {
            this.productName = productName;
            this.productPrice = productPrice;
            this.productDescription = productDescription;
        }
    }

    class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

        ArrayList<Product> productArrayList;

        ProductAdapter(ArrayList<Product> productArrayList) {
            this.productArrayList = productArrayList;
        }

        @NonNull
        @Override
        public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(MainActivity.this)
                    .inflate(R.layout.item_product, parent, false);

            return new ProductViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
            Product product = productArrayList.get(position);

            holder.txtNumber.setText(String.valueOf(position + 1));
            holder.txtName.setText(product.productName);
            holder.txtPrice.setText(product.productPrice);
            holder.txtDescription.setText(product.productDescription);

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(
                            MainActivity.this,
                            "Sản phẩm được chọn: " + product.productName,
                            Toast.LENGTH_SHORT
                    ).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return productArrayList.size();
        }

        class ProductViewHolder extends RecyclerView.ViewHolder {

            TextView txtNumber;
            TextView txtName;
            TextView txtPrice;
            TextView txtDescription;

            ProductViewHolder(@NonNull View itemView) {
                super(itemView);

                txtNumber = itemView.findViewById(R.id.txtNumber);
                txtName = itemView.findViewById(R.id.txtName);
                txtPrice = itemView.findViewById(R.id.txtPrice);
                txtDescription = itemView.findViewById(R.id.txtDescription);
            }
        }
    }
}