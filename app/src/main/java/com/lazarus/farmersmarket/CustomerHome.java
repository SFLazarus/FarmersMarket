package com.lazarus.farmersmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class CustomerHome extends AppCompatActivity {

    List<Product> goods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_home);

        goods=new ArrayList<>();
        goods.add(new Product("Basil", "Cost is 2.49USD", "Quantity is 7lb", "The fragrant, sweet smell and peppery taste is key to making a great pesto as well as tomato-based pasta sauces.", "Farmer's Name is Sam Hill", "4", "Expires after 2-3 Years", R.drawable.product0_image));
        goods.add(new Product("Sweet Corn", "Cost is 3.5USD", "Quantity is 4lb", "GRILLING husked sweet corn directly on the flame caramelizes the sugar in the kernels and tightens their texture, particularly sugar-enhanced varieties.", "Farmer's Name is Sam Reed", "4", "Expires after 1-3 days", R.drawable.product1_image));
        goods.add(new Product("Garlic", "Cost is 1.59USD", "Quantity is 8lb", "creamy cloves with a nutty, mild taste", "Farmer's Name is Sam Street", "5", "Expires after 3-5 months", R.drawable.product2_image));
        goods.add(new Product("Wheat", "Cost is 1.5USD", "Quantity is 6lb", "seeds could be stored for long periods in a dry climate, and can be used for bread", "Farmer's Name is Jack Fig", "4", "Expires after 6 months", R.drawable.product3_image));
        goods.add(new Product("Cherry Tomatoes", "Cost is 2.9USD", "Quantity is 6lb", "small round tomato believed to be an intermediate genetic admixture between wild currant-type tomatoes and domesticated garden tomatoes. Cherry tomatoes range in size from a thumbtip up to the size of a golf ball, and can range from spherical to slightly oblong in shape.", "Farmer's Name is Steve Miller", "4", "Expires after 5 days", R.drawable.product4_image));
        goods.add(new Product("Black Beans", "Cost is 0.99USD", "Quantity is 4lb", "shell-like appearance, black beans are, in fact, the edible seeds of the plant", "Farmer's Name is Bill Parker", "3", "Expires after 3-5 years", R.drawable.product5_image));
        goods.add(new Product("Rice", "Cost is 0.99USD", "Quantity is 8lb", "Broken rice is used in brewing, distilling, and in the manufacture of starch and rice flour. Hulls are used for fuel, packing material, industrial grinding, fertilizer manufacture, and in the manufacture of an industrial chemical called furfural.", "Farmer's Name is Sam Parker", "5", "Expires after 6 months", R.drawable.product6_image));
        goods.add(new Product("Potatoes", "Cost is 2.47USD", "Quantity is 5lb", "Fresh potatoes are baked, boiled, or fried and used in a staggering range of recipes", "Farmer's Name is Jim Reed", "5", "Expires after 3-5 months", R.drawable.product7_image));
        goods.add(new Product("Oats", "Cost is 3.99USD", "Quantity is 9lb", "rolled or crushed into oatmeal, or ground into fine oat flour. Oatmeal is chiefly eaten as porridge, but may also be used in a variety of baked goods, such as oatcakes, oatmeal cookies and oat bread.", "Farmer's Name is Steve Hill", "4", "Expires after 12 months", R.drawable.product8_image));
        goods.add(new Product("Coconuts", "Cost is 2.28USD", "Quantity is 8lb", "used primarily for the extraction of coconut oil for use in cooking. ... The seed is protected by a thick, stony shell, or endocarp, and is partially filled with a liquid known as coconut water.", "Farmer's Name is Jack Parker", "3", "Expires after 6-8 months", R.drawable.product9_image));
        goods.add(new Product("Mangoes", "Cost is 1.19USD", "Quantity is 4lb", "The fruit is a drupe, with an outer flesh surrounding a stone.", "Farmer's Name is Joe Jackson", "5", "Expires after 5 days", R.drawable.product10_image));
        goods.add(new Product("Strawberries", "Cost is 5.65USD", "Quantity is 3lb", "soft, sweet, bright red berries. They're also delicious. Strawberries have tiny edible seeds, which grow all over their surface.", "Farmer's Name is Sam Reed", "4", "Expires after 3-7 days", R.drawable.product11_image));
        goods.add(new Product("Bananas", "Cost is 2.99USD", "Quantity is 2lb", "curved, yellow fruit with a thick skin and soft sweet flesh.", "Farmer's Name is Jack Parker", "4", "Expires after 5-7 days", R.drawable.product12_image));
        goods.add(new Product("Plantains", "Cost is 0.99USD", "Quantity is 10", "resembles a banana and is almost always cooked. ... Plantains are very starchy, green, and not as sweet as bananas.", "Farmer's Name is Bill Hill", "3", "Expires after 5-7 days", R.drawable.product13_image));
        goods.add(new Product("Coffee Beans", "Cost is 20USD", "Quantity is 2lb", "It is the pit inside the red or purple fruit often referred to as a cherry. Just like ordinary cherries, the coffee fruit is also a so-called stone fruit.", "Farmer's Name is Joe Reed", "4", "Expires after 9 months", R.drawable.product14_image));
        goods.add(new Product("Grapes", "Cost is 4.23USD", "Quantity is 5lb", "fleshy, rounded fruits that grow in clusters made up of many fruits of greenish, yellowish or purple skin.", "Farmer's Name is Joe Miller", "3", "Expires after 7-14 days", R.drawable.product15_image));
        goods.add(new Product("Olives", "Cost is 3.66USD", "Quantity is 5lb", "subtropical broad-leaved evergreen tree (family Oleaceae) and its edible fruit", "Farmer's Name is Sam Fig", "5", "Expires after 12-18 months", R.drawable.product16_image));

        RecyclerView myrv= findViewById(R.id.recyclerView);

        RecyclerAdapter myAdapter= new RecyclerAdapter(this,goods);
        myrv.setLayoutManager(new GridLayoutManager(this,1));

        myrv.setAdapter(myAdapter);

    }

    public void fOnClickAccount(View view) {
        Intent myintent= new Intent(getBaseContext(),CustomersEditAccount.class);
        startActivity(myintent);
    }

    public void fOnClickOrders(View view) {
        Intent myintent= new Intent(getBaseContext(),CustomerViewOrders.class);
        startActivity(myintent);
    }

    public void fOnClickRequest(View view) {
        Intent myintent= new Intent(getBaseContext(),CustomerMakeRequest.class);
        startActivity(myintent);
    }
}
