package com.example;


import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class DesiDimeGenerator {

    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(1, "com.android.db");
        createGCSSchema(schema);
        new DaoGenerator().generateAll(schema, "app/src/main/java");
    }

    private static void createGCSSchema(Schema schema)
    {
        Entity TopDeals = schema.addEntity("TopDeals");
        TopDeals.addStringProperty("id").primaryKey();
        TopDeals.addStringProperty("title");
        TopDeals.addStringProperty("fpd_flag");
        TopDeals.addStringProperty("off_percent");
        TopDeals.addStringProperty("current_price");
        TopDeals.addStringProperty("original_price");
        TopDeals.addStringProperty("image");
        TopDeals.addStringProperty("comments_count");
        TopDeals.addStringProperty("all_posts_count");
        TopDeals.addStringProperty("created_at");
        TopDeals.addStringProperty("score");
        TopDeals.addStringProperty("vote_value");
        TopDeals.addStringProperty("state");
        TopDeals.addStringProperty("description");
        TopDeals.addStringProperty("share_url");
        TopDeals.addStringProperty("deal_url");



    }




}

