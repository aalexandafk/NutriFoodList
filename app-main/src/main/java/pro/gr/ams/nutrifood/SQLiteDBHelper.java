package pro.gr.ams.nutrifood;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class SQLiteDBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="recipes.db";
    public static final String TABLE_NAME_1="tblRecipes";



    public static final String TABLE_NAME_2="tblRegistration";
    public static final String COL_1="ID";
    public static final String COL_2="Email";
    public static final String COL_3="FirstName";
    public static final String COL_4="MiddleName";
    public static final String COL_5="LastName";
    public static final String COL_6="Password";



    public SQLiteDBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME_1 + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,RecipeTitle TEXT,ContentOne TEXT,ContentTwo TEXT,ContentThree TEXT,ConvertedCalories TEXT,Video TEXT,Category TEXT,AssetOne TEXT, AssetTwo TEXT,AssetThree TEXT)");
        db.execSQL("CREATE TABLE tblRegistration (ID INTEGER PRIMARY KEY AUTOINCREMENT ,Email TEXT ,FirstName TEXT ,MiddleName TEXT ,LastName TEXT ,Password TEXT)");


        ContentValues tb1cv1 = new ContentValues();
        tb1cv1.put("RecipeTitle", "Greek Yogurt Chicken Salad Sandwich");
        tb1cv1.put("ContentOne", "Greek yogurt is an excellent healthy substitute, but no one has to know because you can’t tell\n" +
                "the difference. [GET THE RECIPE.]\n" +
                "INGREDIENTS:\n" +
                "2 cups leftover rotisserie chicken\n" +
                "1/2 cup diced red onion\n" +
                "1/2 cup diced apple\n" +
                "1/2 cup grapes, halved\n" +
                "1/4 cup dried cranberries\n" +
                "1/4 cup slivered almonds\n" +
                "1/2 cup plain Greek yogurt\n" +
                "1 tablespoon freshly squeezed lemon juice, or more, to taste\n" +
                "1/2 teaspoon garlic powder\n" +
                "Kosher salt and freshly ground black pepper\n" +
                "8 slices bread\n" +
                "4 leaves of Boston bibb lettuce\n" +
                "DIRECTIONS:\n" +
                "1. In a large bowl, combine chicken, red onion, apple, grapes, dried cranberries, sliced\n" +
                "almonds, Greek yogurt, lemon juice, garlic powder, salt, and pepper, to taste.\n" +
                "2. Serve sandwiches on bread with chicken mixture and lettuce.");
        tb1cv1.put("ContentTwo", "");
        tb1cv1.put("ContentThree", "");
        tb1cv1.put("ConvertedCalories", "cat1_001.png");
        tb1cv1.put("Video", "https://www.youtube.com/watch?v=iaK_HqcksqM");
        tb1cv1.put("Category", "1");
        tb1cv1.put("AssetOne", "quick1.jpg");
        tb1cv1.put("AssetTwo", "");
        tb1cv1.put("AssetThree", "");
        long tb1insertcv1 = db.insert(TABLE_NAME_1, null, tb1cv1);



        ContentValues tb1cv2 = new ContentValues();
        tb1cv2.put("RecipeTitle", "Easy Burrito Bowls");
        tb1cv2.put("ContentOne", "Skip Chipotle and try these burrito bowls right at home. It’s easier, healthier and 10000x tastier.\n" +
                "[GET THE RECIPE.]\n" +
                "INGREDIENTS:\n" +
                "1 cup uncooked rice\n" +
                "1 cup salsa, homemade or store-bought\n" +
                "3 cups chopped Romaine lettuce\n" +
                "1 (15.25-ounce) can of whole kernel corn, drained\n" +
                "1 (15-ounce) black beans, drained and rinsed\n" +
                "2 Roma tomatoes, diced\n" +
                "1 avocado, halved, seeded, peeled, and diced\n" +
                "2 tablespoons chopped fresh cilantro leaves\n" +
                "FOR THE CHIPOTLE CREAM SAUCE\n" +
                "1 cup sour cream\n" +
                "1 tablespoon chipotle paste*\n" +
                "1 clove of garlic, pressed\n" +
                "Juice of 1 lime\n" +
                "1/4 teaspoon salt, or more, to taste\n" +
                "DIRECTIONS:\n" +
                "1. To make the chipotle cream sauce, whisk together sour cream, chipotle paste, garlic,\n" +
                "lime juice, and salt; set aside.\n" +
                "2. In a large saucepan of 1 1/2 cups water, cook rice according to package instructions; let\n" +
                "cool and stir in salsa; set aside.\n" +
                "3. To assemble the bowls, divide the rice mixture into serving bowls; top with lettuce, corn,\n" +
                "black beans, tomatoes, avocado, and cilantro.\n" +
                "4. Serve immediately, drizzled with chipotle cream sauce.");
        tb1cv2.put("ContentTwo", "");
        tb1cv2.put("ContentThree", "");
        tb1cv2.put("ConvertedCalories", "cat1_002.png");
        tb1cv2.put("Video", "https://www.youtube.com/watch?v=dkuwlOHkB3Q");
        tb1cv2.put("Category", "1");
        tb1cv2.put("AssetOne", "quick2.jpg");
        tb1cv2.put("AssetTwo", "");
        tb1cv2.put("AssetThree", "");
        long tb1insertcv2 = db.insert(TABLE_NAME_1, null, tb1cv2);


        ContentValues tb1cv3 = new ContentValues();
        tb1cv3.put("RecipeTitle", "Avocado Pasta");
        tb1cv3.put("ContentOne", "The easiest, most unbelievably creamy avocado pasta. And it’ll be on your dinner table in just\n" +
                "20 min. Done and done.\n" +
                "[GET THE RECIPE.]\n" +
                "INGREDIENTS:\n" +
                "12 ounces spaghetti\n" +
                "2 ripe avocados, halved, seeded and peeled\n" +
                "1/2 cup fresh basil leaves\n" +
                "2 cloves garlic\n" +
                "2 tablespoons freshly squeezed lemon juice\n" +
                "Kosher salt and freshly ground black pepper, to taste\n" +
                "1/3 cup olive oil\n" +
                "1 cup cherry tomatoes, halved\n" +
                "1/2 cup canned corn kernels, drained and rinsed\n" +
                "DIRECTIONS:\n" +
                "1. In a large pot of boiling salted water, cook pasta according to package instructions; drain\n" +
                "well.\n" +
                "2. To make the avocado sauce, combine avocados, basil, garlic and lemon juice in the bowl\n" +
                "of a food processor; season with salt and pepper, to taste. With the motor running, add\n" +
                "olive oil in a slow stream until emulsified; set aside.\n" +
                "3. In a large bowl, combine pasta, avocado sauce, cherry tomatoes and corn.\n" +
                "4. Serve immediately.");
        tb1cv3.put("ContentTwo", "");
        tb1cv3.put("ContentThree", "");
        tb1cv3.put("ConvertedCalories", "cat1_003.png");
        tb1cv3.put("Video", "");
        tb1cv3.put("Category", "1");
        tb1cv3.put("AssetOne", "quick3.jpg");
        tb1cv3.put("AssetTwo", "");
        tb1cv3.put("AssetThree", "");
        long tb1insertcv3 = db.insert(TABLE_NAME_1, null, tb1cv3);


        ContentValues tb1cv4 = new ContentValues();
        tb1cv4.put("RecipeTitle", "PF Chang’s Chicken Lettuce Wraps");
        tb1cv4.put("ContentOne", "A copycat recipe that you can easily make right at home in just 20 minutes. And it tastes a\n" +
                "million times better too. Seriously. [GET THE RECIPE.]\n" +
                "INGREDIENTS:\n" +
                "1 tablespoon olive oil\n" +
                "1 pound ground chicken\n" +
                "2 cloves garlic, minced\n" +
                "1 onion, diced\n" +
                "1/4 cup hoisin sauce\n" +
                "2 tablespoons soy sauce\n" +
                "1 tablespoon rice wine vinegar\n" +
                "1 tablespoon freshly grated ginger\n" +
                "1 tablespoon Sriracha, optional\n" +
                "1 (8-ounce) can of whole water chestnuts, drained and diced\n" +
                "2 green onions, thinly sliced\n" +
                "Kosher salt and freshly ground black pepper, to taste\n" +
                "1 head of butter lettuce\n" +
                "DIRECTIONS:\n" +
                "1. Heat olive oil in a saucepan over medium-high heat. Add ground chicken and cook until\n" +
                "browned, about 3-5 minutes, making sure to crumble the chicken as it cooks; drain\n" +
                "excess fat.\n" +
                "2. Stir in garlic, onion, hoisin sauce, soy sauce, rice wine vinegar, ginger and Sriracha until\n" +
                "onions have become translucent, about 1-2 minutes.\n" +
                "3. Stir in chestnuts and green onions until tender, about 1-2 minutes; season with salt and\n" +
                "pepper, to taste.\n" +
                "4. To serve, spoon several tablespoons of the chicken mixture into the center of a lettuce\n" +
                "leaf, taco-style.");
        tb1cv4.put("ContentTwo", "");
        tb1cv4.put("ContentThree", "");
        tb1cv4.put("ConvertedCalories", "cat1_004.png");
        tb1cv4.put("Video", "");
        tb1cv4.put("Category", "1");
        tb1cv4.put("AssetOne", "quick4.jpg");
        tb1cv4.put("AssetTwo", "");
        tb1cv4.put("AssetThree", "");
        long tb1insertcv4 = db.insert(TABLE_NAME_1, null, tb1cv4);


        ContentValues tb1cv5 = new ContentValues();
        tb1cv5.put("RecipeTitle", "Baked Banana-Nut Oatmeal Cups");
        tb1cv5.put("ContentOne", "Muffins meet oatmeal in these moist and tasty grab-and-go oatmeal cups. [GET THE RECIPE.]\n" +
                "Ingredients\n" +
                "3 cups rolled oats (see Tip)\n" +
                "1 ½ cups low-fat milk\n" +
                "2 ripe bananas, mashed (about 3/4 cup)\n" +
                "⅓ cup packed brown sugar\n" +
                "2 large eggs, lightly beaten\n" +
                "1 teaspoon baking powder\n" +
                "1 teaspoon ground cinnamon\n" +
                "1 teaspoon vanilla extract\n" +
                "½ teaspoon salt\n" +
                "½ cup toasted chopped pecans\n" +
                "Directions\n" +
                "Step 1\n" +
                "Preheat oven to 375 degrees F. Coat a muffin tin with cooking spray.\n" +
                "Step 2\n" +
                "Combine oats, milk, bananas, brown sugar, eggs, baking powder, cinnamon, vanilla and salt in\n" +
                "a large bowl. Fold in pecans. Divide the mixture among the muffin cups (about 1/3 cup each).\n" +
                "Bake until a toothpick inserted in the center comes out clean, about 25 minutes. Cool in the pan\n" +
                "for 10 minutes, then turn out onto a wire rack. Serve warm or at room temperature.");
        tb1cv5.put("ContentTwo", "");
        tb1cv5.put("ContentThree", "");
        tb1cv5.put("ConvertedCalories", "Nutrition Facts\n" +
                "Serving Size: 1 muffin\n" +
                "Per Serving: 176 calories; protein 5.2g; carbohydrates 26.4g; dietary fiber 3.1g; sugars 10.5g;\n" +
                "fat 6.2g; saturated fat 1.2g; cholesterol 33.4mg; vitamin a iu 118.7IU; vitamin c 1.8mg; folate\n" +
                "20.2mcg; calcium 85.3mg; iron 1.1mg; magnesium 36mg; potassium 227.9mg; sodium\n" +
                "165.6mg; thiamin 0.1mg; added sugar 6g.\n" +
                "Exchanges: 1 fat, 1 starch, 1/2 fruit, 1/2 other carbohydrate");
        tb1cv5.put("Video", "");
        tb1cv5.put("Category", "2");
        tb1cv5.put("AssetOne", "diet1.png");
        tb1cv5.put("AssetTwo", "");
        tb1cv5.put("AssetThree", "");
        long tb1insertcv5 = db.insert(TABLE_NAME_1, null, tb1cv5);


        ContentValues tb1cv6 = new ContentValues();
        tb1cv6.put("RecipeTitle", "3-Ingredient Bell Pepper & Cheese Egg Cups ");
        tb1cv6.put("ContentOne", "Requiring just three main ingredients—bell peppers, eggs and shredded cheese—these\n" +
                "portable baked eggs are simple to assemble and perfect for meal prep. [GET THE RECIPE.]\n" +
                "Ingredients\n" +
                "4 medium bell peppers, any color\n" +
                "¼ teaspoon salt, divided\n" +
                "¼ teaspoon ground pepper, divided\n" +
                "8 large eggs\n" +
                "¼ cup Mexican-blend shredded cheese\n" +
                "Directions\n" +
                "Step 1\n" +
                "Preheat oven to 400°F. Coat a baking pan with cooking spray.\n" +
                "Step 2\n" +
                "Cut bell peppers in half through the stem end. Remove ribs and seeds. Place the peppers in the\n" +
                "pan cut-side up and sprinkle with 1/8 teaspoon each salt and pepper.\n" +
                "Step 3\n" +
                "Bake the peppers for 15 minutes. Remove the pan from the oven and crack 1 egg into each\n" +
                "pepper cup. Season with the remaining 1/4 teaspoon each salt and pepper, then top each with\n" +
                "1/2 tablespoon of cheese.\n" +
                "Step 4\n" +
                "Bake until the egg whites are set, 15 to 20 minutes. Sprinkle with cilantro, if desired.");
        tb1cv6.put("ContentTwo", "");
        tb1cv6.put("ContentThree", "");
        tb1cv6.put("ConvertedCalories", "Nutrition Facts\n" +
                "Serving Size: 2 bell pepper cups\n" +
                "Per Serving: 205 calories; fat 12g; cholesterol 379mg; sodium 316mg; carbohydrates 8g; dietary\n" +
                "fiber 2g; protein 15g; sugars 5g; niacin equivalents 1mg; saturated fat 4g; vitamin a iu 4313IU;\n" +
                "potassium 397mg.");
        tb1cv6.put("Video", "");
        tb1cv6.put("Category", "2");
        tb1cv6.put("AssetOne", "diet2.png");
        tb1cv6.put("AssetTwo", "");
        tb1cv6.put("AssetThree", "");
        long tb1insertcv6 = db.insert(TABLE_NAME_1, null, tb1cv6);


        ContentValues tb1cv7 = new ContentValues();
        tb1cv7.put("RecipeTitle", "Chopped Power Salad with Chicken");
        tb1cv7.put("ContentOne", "Enjoy this filling and colorful salad for your diet meal. The dressing gets made in the same bowl\n" +
                "that the salad is tossed in, so the greens absorb every bit of flavor. [GET THE RECIPE.]\n" +
                "Ingredients\n" +
                "Ingredient Checklist\n" +
                "¼ cup extra-virgin olive oil\n" +
                "3 tablespoons lemon juice\n" +
                "1 clove garlic, grated\n" +
                "½ teaspoon dried oregano\n" +
                "½ teaspoon sugar\n" +
                "¼ teaspoon salt\n" +
                "¼ teaspoon ground pepper\n" +
                "4 cups torn green-leaf lettuce\n" +
                "4 cups baby spinach\n" +
                "2 cups shredded cooked chicken\n" +
                "1 cup halved grape tomatoes\n" +
                "1 cup halved and sliced cucumber\n" +
                "½ cup slivered red onion\n" +
                "⅓ cup sliced pepperoncini\n" +
                "⅓ cup crumbled feta cheese\n" +
                "2 tablespoons toasted unsalted sunflower seeds\n" +
                "Directions\n" +
                "Step 1\n" +
                "Whisk oil, lemon juice, garlic, oregano, sugar, salt and pepper together in a large bowl. Add\n" +
                "lettuce, spinach, chicken, tomatoes, cucumber, onion and pepperoncini; toss to coat. Serve\n" +
                "sprinkled with feta and sunflower seeds.");
        tb1cv7.put("ContentTwo", "");
        tb1cv7.put("ContentThree", "");
        tb1cv7.put("ConvertedCalories", "Nutrition Facts\n" +
                "Serving Size: about 2½ cups\n" +
                "Per Serving: 466 calories; fat 24g; cholesterol 130mg; sodium 591mg; carbohydrates 14g;\n" +
                "dietary fiber 4g; protein 49g; sugars 7g; niacin equivalents 30mg; saturated fat 5g; vitamin a iu\n" +
                "6881IU; potassium 1068mg.");
        tb1cv7.put("Video", "");
        tb1cv7.put("Category", "2");
        tb1cv7.put("AssetOne", "diet3.png");
        tb1cv7.put("AssetTwo", "");
        tb1cv7.put("AssetThree", "");
        long tb1insertcv7 = db.insert(TABLE_NAME_1, null, tb1cv7);


        ContentValues tb1cv8 = new ContentValues();
        tb1cv8.put("RecipeTitle", "Salmon-Stuffed Avocados");
        tb1cv8.put("ContentOne", "Canned salmon is a valuable pantry staple and a practical way to include heart-healthy\n" +
                "omega-3-rich fish in your diet. Here, we combine it with avocados in an easy no-cook meal.\n" +
                "[GET THE RECIPE.]\n" +
                "Ingredients\n" +
                "Ingredient Checklist\n" +
                "½ cup nonfat plain Greek yogurt\n" +
                "½ cup diced celery\n" +
                "2 tablespoons chopped fresh parsley\n" +
                "1 tablespoon lime juice\n" +
                "2 teaspoons mayonnaise\n" +
                "1 teaspoon Dijon mustard\n" +
                "⅛ teaspoon salt\n" +
                "⅛ teaspoon ground pepper\n" +
                "2 (5 ounce) cans salmon, drained, flaked, skin and bones removed\n" +
                "2 avocados\n" +
                "Chopped chives for garnish\n" +
                "Directions\n" +
                "Step 1\n" +
                "Combine yogurt, celery, parsley, lime juice, mayonnaise, mustard, salt, and pepper in a medium\n" +
                "bowl; mix well. Add salmon and mix well.\n" +
                "Step 2\n" +
                "Halve avocados lengthwise and remove pits. Scoop about 1 tablespoon flesh from each\n" +
                "avocado half into a small bowl. Mash the scooped-out avocado flesh with a fork and stir into the\n" +
                "salmon mixture.\n" +
                "Step 3\n" +
                "Fill each avocado half with about 1/4 cup of the salmon mixture, mounding it on top of the\n" +
                "avocado halves. Garnish with chives, if desired.");
        tb1cv8.put("ContentTwo", "");
        tb1cv8.put("ContentThree", "");
        tb1cv8.put("ConvertedCalories", "Nutrition Facts\n" +
                "Serving Size: 1/2 avocado and 1/4 cup salmon salad\n" +
                "Per Serving: 293 calories; protein 22.5g; carbohydrates 10.5g; dietary fiber 7g; sugars 1.8g; fat\n" +
                "19.6g; saturated fat 3g; cholesterol 61.2mg; vitamin a iu 413IU; vitamin c 14.1mg; folate\n" +
                "94.1mcg; calcium 94.2mg; iron 1.1mg; magnesium 52mg; potassium 807.2mg; sodium\n" +
                "399.8mg.");
        tb1cv8.put("Video", "");
        tb1cv8.put("Category", "2");
        tb1cv8.put("AssetOne", "diet4.png");
        tb1cv8.put("AssetTwo", "");
        tb1cv8.put("AssetThree", "");
        long tb1insertcv8 = db.insert(TABLE_NAME_1, null, tb1cv8);


        ContentValues tb1cv9 = new ContentValues();
        tb1cv9.put("RecipeTitle", "Spicy Chicken Breasts");
        tb1cv9.put("ContentOne", "This spicy chicken recipe makes a great skinless chicken breast that can be served over salad\n" +
                "greens or as an entrée. [GET THE RECIPE.]\n" +
                "Ingredients\n" +
                "2 ½ tablespoons paprika\n" +
                "2 tablespoons garlic powder\n" +
                "1 tablespoon salt\n" +
                "1 tablespoon onion powder\n" +
                "1 tablespoon dried thyme\n" +
                "1 tablespoon ground cayenne pepper\n" +
                "1 tablespoon ground black pepper\n" +
                "4 skinless, boneless chicken breast halves\n" +
                "Directions\n" +
                "Step 1\n" +
                "Preheat the grill for medium-high heat. Lightly oil the grill grate.\n" +
                "Step 2\n" +
                "Mix together paprika, garlic powder, salt, onion powder, thyme, cayenne pepper, and ground\n" +
                "black pepper in a bowl. Set aside 3 tablespoons spice mixture; store remainder in an airtight\n" +
                "container for later use.\n" +
                "Step 3\n" +
                "Rub reserved 3 tablespoons spice mixture all over chicken breasts.\n" +
                "Step 4\n" +
                "Cook chicken on the preheated grill until juices run clear, 6 to 8 minutes on each side. An\n" +
                "instant-read thermometer inserted into the center should read at least 165 degrees F (74\n" +
                "degrees C).");
        tb1cv9.put("ContentTwo", "");
        tb1cv9.put("ContentThree", "");
        tb1cv9.put("ConvertedCalories", "Nutrition Facts\n" +
                "Per Serving: 173 calories; protein 29.2g; carbohydrates 9.2g; fat 2.4g; cholesterol 68.4mg;\n" +
                "sodium 1825.9mg.");
        tb1cv9.put("Video", "");
        tb1cv9.put("Category", "3");
        tb1cv9.put("AssetOne", "ls1.png");
        tb1cv9.put("AssetTwo", "");
        tb1cv9.put("AssetThree", "");
        long tb1insertcv9 = db.insert(TABLE_NAME_1, null, tb1cv9);


        ContentValues tb1cv10 = new ContentValues();
        tb1cv10.put("RecipeTitle", "Homemade Black Bean Veggie Burgers");
        tb1cv10.put("ContentOne", "With this black bean burger recipe, you will never want to eat frozen veggie burgers again.\n" +
                "These are so easy, and you'll be proud to have created such a vegetarian delight. [GET THE\n" +
                "RECIPE.]\n" +
                "Ingredients\n" +
                "cooking spray\n" +
                "1 (16 ounce) can black beans, drained and rinsed\n" +
                "½ green bell pepper, cut into 2 inch pieces\n" +
                "½ onion, cut into wedges\n" +
                "3 cloves garlic, peeled\n" +
                "1 egg\n" +
                "1 tablespoon chili powder\n" +
                "1 tablespoon cumin\n" +
                "1 teaspoon Thai chili sauce or hot sauce\n" +
                "½ cup bread crumbs\n" +
                "Directions\n" +
                "Step 1\n" +
                "Preheat an outdoor grill for high heat. Lightly oil a sheet of aluminum foil with cooking spray.\n" +
                "Step 2\n" +
                "Mash black beans in a medium bowl with a fork until thick and pasty.\n" +
                "Step 3\n" +
                "Finely chop bell pepper, onion, and garlic in a food processor. Stir chopped vegetables into\n" +
                "mashed beans.\n" +
                "Step 4\n" +
                "Stir together egg, chili powder, cumin, and chili sauce in a small bowl. Add to the mashed beans\n" +
                "and stir to combine. Mix in bread crumbs until the mixture is sticky and holds together. Divide\n" +
                "the mixture into four patties and place on the prepared foil.\n" +
                "Step 5\n" +
                "Grill on the preheated grill for about 8 minutes on each side.");
        tb1cv10.put("ContentTwo", "");
        tb1cv10.put("ContentThree", "");
        tb1cv10.put("ConvertedCalories", "Nutrition Facts\n" +
                "Per Serving: 198 calories; protein 11.2g; carbohydrates 33.1g; fat 3g; cholesterol 46.5mg;\n" +
                "sodium 607.3mg.");
        tb1cv10.put("Video", "");
        tb1cv10.put("Category", "3");
        tb1cv10.put("AssetOne", "ls2.png");
        tb1cv10.put("AssetTwo", "");
        tb1cv10.put("AssetThree", "");
        long tb1insertcv10 = db.insert(TABLE_NAME_1, null, tb1cv10);


        ContentValues tb1cv11 = new ContentValues();
        tb1cv11.put("RecipeTitle", "Roasted Cauliflower \"Rice\"");
        tb1cv11.put("ContentOne", "Cauliflower rice is a great low-sugar dish to have in your arsenal especially if you are eating\n" +
                "low-sugar. [GET THE RECIPE.]\n" +
                "Ingredients\n" +
                "cooking spray\n" +
                "2 heads of cauliflower, cut into 1/2-inch pieces\n" +
                "1 ½ tablespoon avocado oil\n" +
                "¾ teaspoon salt, divided\n" +
                "Directions\n" +
                "Step 1\n" +
                "Preheat oven to 450 degrees F (230 degrees C). Line 3 baking sheets with aluminum foil and\n" +
                "lightly spray with cooking spray.\n" +
                "Step 2\n" +
                "Fill a food processor 1/4 of the way with cauliflower pieces. Pulse 8 to 12 times until cauliflower\n" +
                "is the size of rice grains. Transfer to a large bowl. Repeat with remaining cauliflower pieces.\n" +
                "Step 3\n" +
                "Drizzle avocado oil over cauliflower \"rice\"; toss until well-distributed.\n" +
                "Step 4\n" +
                "Spread 2 1/2 cups of the rice in an even layer on each lined baking sheet.\n" +
                "Step 5\n" +
                "Roast rice until golden, about 16 minutes. Remove from oven, stir well, and spread out again.\n" +
                "Return to oven and roast for 6 minutes. Remove from oven, stir well, and spread out again.\n" +
                "Continue roasting until browned, about 5 minutes more.\n" +
                "Step 6\n" +
                "Season each sheet of roasted rice with 1/4 teaspoon salt and place in a large container.");
        tb1cv11.put("ContentTwo", "");
        tb1cv11.put("ContentThree", "");
        tb1cv11.put("ConvertedCalories", "Nutrition Facts\n" +
                "Per Serving: 59 calories; protein 2.8g; carbohydrates 7.6g; fat 2.8g; sodium 261.1mg.");
        tb1cv11.put("Video", "");
        tb1cv11.put("Category", "3");
        tb1cv11.put("AssetOne", "ls3.png");
        tb1cv11.put("AssetTwo", "");
        tb1cv11.put("AssetThree", "");
        long tb1insertcv11 = db.insert(TABLE_NAME_1, null, tb1cv11);


        ContentValues tb1cv12 = new ContentValues();
        tb1cv12.put("RecipeTitle", "Diabetic-Friendly Pork Stroganoff");
        tb1cv12.put("ContentOne", "People with diabetes can enjoy cozy comfort foods like stroganoff. See how a few smart swaps\n" +
                "can lower carbs, calories, and sodium without losing flavor or cheesy, creamy appeal. [GET\n" +
                "THE RECIPE.]\n" +
                "Ingredients\n" +
                "6 ounces whole-grain penne pasta\n" +
                "1 ½ cups reduced-sodium beef broth, divided\n" +
                "½ cup sour cream\n" +
                "¼ cup all-purpose flour\n" +
                "1 teaspoon Dijon mustard\n" +
                "¾ teaspoon salt\n" +
                "½ teaspoon chopped fresh thyme\n" +
                "¼ teaspoon ground black pepper\n" +
                "2 tablespoons vegetable oil, divided\n" +
                "1 pound pork tenderloin, cut into 1-inch chunks\n" +
                "1 (8 ounces) package of fresh button mushrooms, sliced\n" +
                "1 (8 ounces) package broccoli, cut into bite-sized pieces\n" +
                "1 cup sliced onion\n" +
                "1 tablespoon chopped fresh parsley, or to taste\n" +
                "ground black pepper to taste\n" +
                "Directions\n" +
                "Step 1\n" +
                "Bring a large pot of water to a boil. Add penne and cook, stirring occasionally, until tender yet\n" +
                "firm to the bite, about 11 minutes.\n" +
                "Step 2\n" +
                "Meanwhile, whisk 1/2 cup broth, sour cream, flour, mustard, salt, thyme, and 1/4 teaspoon\n" +
                "pepper together in a small bowl.\n" +
                "Step 3\n" +
                "Heat 1 tablespoon oil in a large nonstick skillet over medium-high heat. Add pork; cook until\n" +
                "browned on all sides, about 5 minutes. Transfer to a bowl. Drain pasta and keep warm.\n" +
                "Step 4\n" +
                "Heat remaining oil in a skillet over medium-high heat. Add mushrooms, broccoli, and onion.\n" +
                "Cook, stirring occasionally, until vegetables are lightly browned and crisp-tender, 5 to 7 minutes.\n" +
                "Return pork to the skillet. Add remaining broth. Bring mixture to a simmer.\n" +
                "Step 5\n" +
                "Reduce heat to medium. Stir sour cream mixture into the skillet. Cook, stirring frequently, until\n" +
                "thickened and bubbly. Gently simmer until pork is cooked through and no longer pink in the\n" +
                "center, about 2 minutes more.\n" +
                "Step 6\n" +
                "Serve pork mixture over pasta and sprinkle with parsley and additional black pepper.");
        tb1cv12.put("ContentTwo", "");
        tb1cv12.put("ContentThree", "");
        tb1cv12.put("ConvertedCalories", "Nutrition Facts\n" +
                "Per Serving: 308 calories; protein 20.3g; carbohydrates 32g; fat 11.5g; cholesterol 41mg;\n" +
                "sodium 382.6mg.");
        tb1cv12.put("Video", "");
        tb1cv12.put("Category", "3");
        tb1cv12.put("AssetOne", "ls4.png");
        tb1cv12.put("AssetTwo", "");
        tb1cv12.put("AssetThree", "");
        long tb1insertcv12 = db.insert(TABLE_NAME_1, null, tb1cv12);


        ContentValues tb1cv13 = new ContentValues();
        tb1cv13.put("RecipeTitle", "Baked Salmon");
        tb1cv13.put("ContentOne", "This healthy baked salmon is the best way to feed a crowd. There's no skillet cooking at\n" +
                "all—everything is oven-baked in foil, making prep and cleanup a breeze. We believe it might just\n" +
                "be the best-baked salmon recipe...ever. Serve this baked salmon with any of your favorite\n" +
                "veggies. We love it with roasted potatoes and Brussels sprouts.\n" +
                "INGREDIENTS\n" +
                "2 lemons, thinly sliced\n" +
                "1 large salmon fillet (about 3 lb.)\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "6 tbsp. butter, melted\n" +
                "2 tbsp. honey\n" +
                "3 cloves garlic, minced\n" +
                "1 tsp. chopped thyme leaves\n" +
                "1 tsp. dried oregano\n" +
                "Chopped fresh parsley, for garnish\n" +
                "DIRECTIONS\n" +
                "1. Preheat the oven to 350°. Line a large rimmed baking sheet with foil and grease with\n" +
                "cooking spray. To the center of the foil, lay lemon slices in an even layer.\n" +
                "2. Season both sides of the salmon with salt and pepper and place on top of lemon slices.\n" +
                "3. In a small bowl, whisk together butter, honey, garlic, thyme, and oregano. Pour over\n" +
                "salmon then fold up foil around the salmon. Bake until the salmon is cooked through,\n" +
                "about 25 minutes. Switch the oven to broil, and broil for 2 minutes, or until the butter\n" +
                "mixture has thickened.\n" +
                "4. Garnish with parsley before serving.");
        tb1cv13.put("ContentTwo", "");
        tb1cv13.put("ContentThree", "");
        tb1cv13.put("ConvertedCalories", "Nutrition (per serving): 396 calories, 68 g protein, 11 g carbohydrates, 1 g\n" +
                "fiber, 9 g sugar, 30 g fat, 14 g saturated fat, 548 mg sodium");
        tb1cv13.put("Video", "");
        tb1cv13.put("Category", "4");
        tb1cv13.put("AssetOne", "lc1.png");
        tb1cv13.put("AssetTwo", "");
        tb1cv13.put("AssetThree", "");
        long tb1insertcv13 = db.insert(TABLE_NAME_1, null, tb1cv13);


        ContentValues tb1cv14 = new ContentValues();
        tb1cv14.put("RecipeTitle", "Vegan Meatballs");
        tb1cv14.put("ContentOne", "Few comfort foods satisfy like a hearty bowl of spaghetti and meatballs. Now, my vegan friends,\n" +
                "you TOO can enjoy this comfort sans guilt! These chickpea-based meatballs pack tons of flavor,\n" +
                "come together quickly and even provide a good amount of protein and fiber.\n" +
                "INGREDIENTS\n" +
                "Cooking spray, for pan\n" +
                "2 c. canned chickpeas\n" +
                "2 1/2 tbsp. chia seeds\n" +
                "6 tbsp. water\n" +
                "1/2 c. rolled oats\n" +
                "1 1/2 tbsp. tomato paste\n" +
                "3 tbsp. chopped basil\n" +
                "1 clove garlic, minced\n" +
                "1/2 tsp. fennel seeds\n" +
                "1/4 tsp. red pepper flakes\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "DIRECTIONS\n" +
                "1. Preheat oven to 425°, then line a medium baking sheet with aluminum foil and grease\n" +
                "with cooking spray.\n" +
                "2. Drain chickpeas, reserving liquid. Transfer chickpeas to a food processor and process\n" +
                "until broken down.\n" +
                "3. Make chia egg: Combine chia seeds and water in a medium bowl and stir to combine.\n" +
                "Let sit 5 minutes, until mixture gels and becomes thick.\n" +
                "4. Add chia egg, oats, tomato paste, basil, garlic, fennel seeds, and red pepper flakes into\n" +
                "the food processor and blend until combined. If mixture is too dry, add liquid from\n" +
                "chickpea can 1 tablespoon at a time until desired consistency is reached. Season with\n" +
                "salt and pepper.\n" +
                "5. Form mixture into 16 meatballs and place on prepared baking sheet. Bake for 10\n" +
                "minutes, flip meatballs, and bake 8 to 10 minutes more, until golden and crisp. Serve\n" +
                "with your favorite pasta and sauce.");
        tb1cv14.put("ContentTwo", "");
        tb1cv14.put("ContentThree", "");
        tb1cv14.put("ConvertedCalories", "Nutrition (per serving): 265 calories, 86 g protein, 20 g carbohydrates, 1\n" +
                "g fiber, 9 g sugar, 2 g fat, 14 g saturated fat, 148 mg sodium");
        tb1cv14.put("Video", "");
        tb1cv14.put("Category", "4");
        tb1cv14.put("AssetOne", "lc2.png");
        tb1cv14.put("AssetTwo", "");
        tb1cv14.put("AssetThree", "");
        long tb1insertcv14 = db.insert(TABLE_NAME_1, null, tb1cv14);


        ContentValues tb1cv15 = new ContentValues();
        tb1cv15.put("RecipeTitle", "Stuffed Cabbage Rolls");
        tb1cv15.put("ContentOne", "You can find a wide variety of cabbage rolls across Europe, Asia, and Africa. This recipe is\n" +
                "based on gołąbki, a Polish dish in which parboiled cabbage leaves encase a minced meat filling\n" +
                "of either pork or beef with onions and rice. What I love most is that the meat and the rice cook in\n" +
                "the cabbage itself. It means very little work on your part and we are always in favor of that. To\n" +
                "ensure even cooking, don't use the outermost leaves of the cabbage—they don't have as much\n" +
                "moisture. Also, don't forget to cover the baking dish with foil. You need that steam circulating!\n" +
                "P.S. Are you keto? If you answered yes, then this recipe is not for you! With both added sugar\n" +
                "(brown sugar) and carbs like rice and bread crumbs, it's tricky to adjust this recipe for the keto\n" +
                "diet. While removing the sugar won't affect too much, removing the rice and bread crumbs will\n" +
                "make it very difficult to roll the meat mixture into the cabbage. If you'd like to make something\n" +
                "similar, try our cabbage burritos! Without the beans and corn, they're completely keto-friendly.\n" +
                "INGREDIENTS\n" +
                "FOR THE SAUCE\n" +
                "2 tbsp. extra-virgin olive oil\n" +
                "1/2 large onion, chopped\n" +
                "3 cloves garlic, minced\n" +
                "2 tbsp. tomato paste\n" +
                "1 (28-oz.) can crushed tomatoes\n" +
                "2 tbsp. balsamic vinegar\n" +
                "1 tbsp. brown sugar\n" +
                "2 tsp. dried oregano\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "FOR THE CABBAGE ROLLS\n" +
                "15 cabbage leaves\n" +
                "1 lb. ground beef\n" +
                "1/4 c. uncooked white rice\n" +
                "1/4 c. Italian bread crumbs\n" +
                "1/2 large onion, chopped\n" +
                "2 tbsp. freshly chopped parsley, plus more for garnish\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "DIRECTIONS\n" +
                "FOR THE SAUCE\n" +
                "1. Preheat the oven to 350°. In a large deep skillet (or large pot) over medium heat, heat\n" +
                "oil. Add onion and cook until soft, 5 minutes. Stir in tomato paste and garlic and cook\n" +
                "until fragrant, 1 minute. Pour over tomatoes then add vinegar, sugar, and oregano.\n" +
                "2. Lower heat to medium-low and simmer for 20 minutes. Season with salt and pepper.\n" +
                "FOR THE ROLLS\n" +
                "1. In a large pot of boiling water, blanch cabbage leaves until tender and flexible, about 1\n" +
                "minute.\n" +
                "2. Make the filling: In a large bowl, combine ground meats, 1 cup of sauce, rice, bread\n" +
                "crumbs, onion, and parsley. Season with salt and pepper.\n" +
                "3. Spread a thin layer of sauce on the bottom of a large baking dish.\n" +
                "4. Using a paring knife, cut out the hard triangular rib from each cabbage leaf. Place about\n" +
                "⅓ cup of filling into one end of each leaf, then roll up, tucking in the sides as you roll.\n" +
                "Place rolls seam-side-down on top of the sauce in the baking dish. Spoon remaining\n" +
                "sauce on top of cabbage rolls then cover the dish with foil. Bake 1 hour 15 minutes, until\n" +
                "rice and meat are cooked through.\n" +
                "5. Garnish with more parsley before serving.");
        tb1cv15.put("ContentTwo", "");
        tb1cv15.put("ContentThree", "");
        tb1cv15.put("ConvertedCalories", "Nutrition (per serving): 413 calories, 23 g protein, 37 g carbohydrates, 6 g fiber,\n" +
                "15 g sugar, 20 g fat, 6 g saturated fat, 651 mg sodium");
        tb1cv15.put("Video", "");
        tb1cv15.put("Category", "4");
        tb1cv15.put("AssetOne", "lc3.png");
        tb1cv15.put("AssetTwo", "");
        tb1cv15.put("AssetThree", "");
        long tb1insertcv15 = db.insert(TABLE_NAME_1, null, tb1cv15);


        ContentValues tb1cv16 = new ContentValues();
        tb1cv16.put("RecipeTitle", "Stuffed Acorn Squash");
        tb1cv16.put("ContentOne", "All our favorite fall flavors come together in this surprisingly easy and super flavorful stuffed\n" +
                "acorn squash. The real star, to our minds, is that lacinato or Tuscan kale. It adds a heartiness\n" +
                "that only a good cruciferous green can provide. Also, the tender, sweet flesh of the squash can't\n" +
                "be overlooked!\n" +
                "INGREDIENTS\n" +
                "3 small acorn squash\n" +
                "3 tbsp. extra-virgin olive oil, divided\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "1 c. farro\n" +
                "2 c. plus 2 tablespoons apple cider, divided\n" +
                "2 sprigs fresh thyme\n" +
                "1/2 lb. sweet Italian sausage\n" +
                "1/2 yellow onion, chopped\n" +
                "2 stalks celery, chopped\n" +
                "2 cloves garlic, minced\n" +
                "1 tbsp. fresh thyme, chopped\n" +
                "1 bunch lacinato kale, stems removed and chopped\n" +
                "DIRECTIONS\n" +
                "1. Preheat oven to 400°. Cut each end off squash and halve.\n" +
                "2. Use a spoon to remove seeds and brush all over with 2 tablespoons olive oil. Season\n" +
                "with salt and pepper and roast until tender, 30-35 minutes.\n" +
                "3. Meanwhile, make farro: in a medium sauce pan, combine farro with 2 cups cider, 1 cup\n" +
                "water, and thyme sprigs. Bring to a simmer and cook, stirring occasionally, until liquid is\n" +
                "evaporated and farro is tender, 25 to 30 minutes. If your liquid is evaporated and farro is\n" +
                "not yet tender, add more water a ¼ cup at a time. Remove thyme sprigs.\n" +
                "4. Meanwhile, make filling: in a large skillet over medium heat, heat remaining oil. Add\n" +
                "sausage and cook, breaking up with a wooden spoon and stirring occasionally until\n" +
                "golden and cooked through, 5 minutes. Remove sausage with a slotted spoon onto a\n" +
                "paper-towel lined plate.\n" +
                "5. Drain most fat from the skillet, reserving about 1 tablespoon for cooking. Add onion and\n" +
                "celery and cook until soft, 6 minutes. Season with salt and pepper. Add garlic and\n" +
                "chopped thyme and cook until fragrant, 1 minute more.\n" +
                "6. Add kale and cook, stirring frequently. Add remaining 2 tablespoons cider after 4 minutes\n" +
                "of cooking, then cook 4 minutes more, or until kale is tender.\n" +
                "7. Add cooked farro and sausage to skillet with vegetables and stir to combine. Taste and\n" +
                "adjust seasoning as needed. Divide mixture among the 6 squash halves. Switch oven to\n" +
                "broil and broil until tops are golden and filling is warmed, 2 to 3 minutes.");
        tb1cv16.put("ContentTwo", "");
        tb1cv16.put("ContentThree", "");
        tb1cv16.put("ConvertedCalories", "Nutrition (per serving): 369 calories, 11 g protein, 54 g carbohydrates, 6 g fiber,\n" +
                "9 g sugar, 14 g fat, 3 g saturated fat, 355 mg sodium");
        tb1cv16.put("Video", "");
        tb1cv16.put("Category", "4");
        tb1cv16.put("AssetOne", "lc4.png");
        tb1cv16.put("AssetTwo", "");
        tb1cv16.put("AssetThree", "");
        long tb1insertcv16 = db.insert(TABLE_NAME_1, null, tb1cv16);


        ContentValues tb1cv17 = new ContentValues();
        tb1cv17.put("RecipeTitle", "Egg Roll Bowls");
        tb1cv17.put("ContentOne", "If you're a fan of crispy savory egg rolls, then you might consider this unwrapped version your\n" +
                "dream lunch. Without the need to wrap or fry, this veggie-packed meal comes together in well\n" +
                "under an hour. Garnish with crispy raw scallions, toasted sesame seeds, and plenty of sriracha\n" +
                "or chili oil.\n" +
                "Wanna make it vegetarian? Swap in chopped mushrooms or a plant-based ground meat\n" +
                "substitute for the pork.\n" +
                "INGREDIENTS\n" +
                "1 tbsp. vegetable oil\n" +
                "1 clove garlic, minced\n" +
                "1 tbsp. minced fresh ginger\n" +
                "1 lb. ground pork\n" +
                "1 tbsp. toasted sesame oil\n" +
                "1/2 onion, thinly sliced\n" +
                "1 c. shredded carrot\n" +
                "1/4 green cabbage, thinly sliced\n" +
                "1/4 c. low-sodium soy sauce\n" +
                "1 tbsp. sriracha\n" +
                "Kosher salt\n" +
                "1 green onion, thinly sliced\n" +
                "1 tbsp. toasted sesame seeds\n" +
                "DIRECTIONS\n" +
                "1. In a large skillet over medium heat, heat vegetable oil. Add garlic and ginger and cook\n" +
                "until fragrant, 1 minute.\n" +
                "2. Add pork and cook, stirring occasionally, until meat is golden in parts and cooked\n" +
                "through, 8 to 10 minutes, breaking meat into small pieces with spoon or spatula.\n" +
                "3. Push pork to the side and add sesame oil. Add onion, carrot, and cabbage. Stir to\n" +
                "combine with meat and add soy sauce and sriracha. Cook until cabbage is tender, 5 to 8\n" +
                "minutes. Season to taste with salt.\n" +
                "4. Transfer mixture to a serving dish and garnish with scallions and sesame seeds.");
        tb1cv17.put("ContentTwo", "");
        tb1cv17.put("ContentThree", "");
        tb1cv17.put("ConvertedCalories", "Nutrition (per serving): 420 calories, 22 g protein, 11 g carbohydrates, 3 g fiber, 5\n" +
                "g sugar, 32 g fat, 10 g saturated fat, 710 mg sodium");
        tb1cv17.put("Video", "");
        tb1cv17.put("Category", "5");
        tb1cv17.put("AssetOne", "hb1.png");
        tb1cv17.put("AssetTwo", "");
        tb1cv17.put("AssetThree", "");
        long tb1insertcv17 = db.insert(TABLE_NAME_1, null, tb1cv17);


        ContentValues tb1cv18 = new ContentValues();
        tb1cv18.put("RecipeTitle", "Tofu Stir-Fry");
        tb1cv18.put("ContentOne", "Tofu can be a hard sell. There are many complaints about its bland texture and flavor, but when\n" +
                "given a special treatment, a transformation takes place. This recipe calls for extra-firm tofu that\n" +
                "has been frozen, a trick my mom taught me. Once defrosted, you’ll see that the tofu has\n" +
                "become more porous, almost sponge-like: this new texture enables it to absorb flavors more\n" +
                "readily. It works perfectly in a stir-fry and equally well in soups and stews. Another one of mom’s\n" +
                "tricks? To simmer the tofu in salted water briefly before stir-frying. Apparently this makes the tofu\n" +
                "hardier and less likely to crumble when jostled in the pan. I don’t question my mother’s wisdom,\n" +
                "but this step is totally optional.\n" +
                "INGREDIENTS\n" +
                "FOR TOFU\n" +
                "1 (14-oz.) block extra-firm tofu, fresh or frozen and defrosted\n" +
                "1 tbsp. low-sodium soy sauce\n" +
                "1 tbsp. sesame oil\n" +
                "1/2 tsp. freshly ground black pepper\n" +
                "2 tbsp. Cornstarch\n" +
                "FOR STIR FRY\n" +
                "3 tbsp. extra-virgin olive oil, divided\n" +
                "Kosher salt\n" +
                "3 cloves garlic, minced\n" +
                "1 tbsp. freshly minced ginger\n" +
                "8 oz. string beans, trimmed\n" +
                "2 small carrots, sliced\n" +
                "1 small head broccoli, cut into florets\n" +
                "1 red bell pepper, seeded and sliced\n" +
                "2 green onions, thinly sliced\n" +
                "FOR SAUCE\n" +
                "2 tbsp. low-sodium soy sauce\n" +
                "2 tsp. sesame oil\n" +
                "1/4 c. water\n" +
                "2 tbsp. packed brown sugar\n" +
                "2 tsp. cornstarch\n" +
                "DIRECTIONS\n" +
                "1. In a medium pot of salted boiling water, simmer tofu for 2 minutes. If using frozen tofu,\n" +
                "simmer until completely defrosted. Remove from heat and let drain in a colander lined\n" +
                "with paper towels. When cool enough to handle, gently squeeze and pat dry. If using\n" +
                "frozen tofu, use firmer pressure to squeeze out water.\n" +
                "2. Cut tofu into bite-sized pieces, then toss together with soy sauce, sesame oil, and black\n" +
                "pepper in a medium bowl. Once liquids are absorbed, toss tofu with cornstarch.\n" +
                "3. In a large skillet over medium-high heat, heat 2 tablespoons oil. Add tofu and let cook\n" +
                "until golden on all sides, turning occasionally, 7 to 8 minutes. Season with salt and\n" +
                "pepper, and remove from skillet and set aside.\n" +
                "4. Heat remaining 1 tablespoon oil and add in garlic and ginger and cook until fragrant, 1\n" +
                "minute. Stir in string beans, carrots, broccoli, red pepper, and green onions. Cook until\n" +
                "tender, about 8 to 10 minutes. Season with salt and pepper.\n" +
                "5. In a small bowl, stir together soy sauce, sesame oil, water, brown sugar, and cornstarch.\n" +
                "Return tofu to skillet and add sauce mixture to pan. Stir and cook until slightly thickened,\n" +
                "2 minutes.");
        tb1cv18.put("ContentTwo", "");
        tb1cv18.put("ContentThree", "");
        tb1cv18.put("ConvertedCalories", "Nutrition (per serving): 76 calories, 20 g protein, 8 g carbohydrates, 10 g fiber,\n" +
                "2 g sugar, 32 g fat, 10 g saturated fat, 210 mg sodium");
        tb1cv18.put("Video", "");
        tb1cv18.put("Category", "5");
        tb1cv18.put("AssetOne", "hb2.png");
        tb1cv18.put("AssetTwo", "");
        tb1cv18.put("AssetThree", "");
        long tb1insertcv18 = db.insert(TABLE_NAME_1, null, tb1cv18);


        ContentValues tb1cv19 = new ContentValues();
        tb1cv19.put("RecipeTitle", "Twice-Baked Sweet Potatoes");
        tb1cv19.put("ContentOne", "We love a good twice-baked potato when we're craving something creamy, carb-y, and\n" +
                "comforting. These twice-baked sweet potatoes exhibit all the same qualities, in addition to being\n" +
                "super healthy—the perfect vegetarian breakfast!\n" +
                "INGREDIENTS\n" +
                "6 large sweet potatoes, scrubbed clean\n" +
                "1 tbsp. extra-virgin olive oil\n" +
                "Kosher salt\n" +
                "1/2 c. milk\n" +
                "1/4 c. sour cream\n" +
                "4 tbsp. melted butter\n" +
                "1 1/2 c. shredded Monterey Jack, divided\n" +
                "1 c. black beans, rinsed and drained\n" +
                "2 green onions, thinly sliced, plus more for garnish\n" +
                "2 cloves garlic, minced\n" +
                "1 c. quartered grape tomatoes\n" +
                "1 avocado, cubed\n" +
                "1 small jalapeño, sliced into rounds\n" +
                "1/4 c. crumbled queso fresco\n" +
                "DIRECTIONS\n" +
                "1. Preheat oven to 375°. Pat potatoes completely dry with paper towels. Poke potatoes all\n" +
                "over with a fork, then rub with oil and sprinkle with salt. Place directly on oven racks and\n" +
                "bake until pierced easily with a fork, about 1 hour. Place on a large baking sheet and let\n" +
                "cool until cool enough to handle.\n" +
                "2. Cut a thin layer off the top of each potato lengthwise. Scoop out insides of each potato,\n" +
                "leaving a ½” border. Place insides in large bowl. (You can keep the potato tops and roast\n" +
                "them on the tray as a snack!)\n" +
                "3. Into the bowl with the potatoes, add milk, sour cream, and butter. Mash until all\n" +
                "ingredients are incorporated and mixture is mostly smooth. Fold in 1 cup Monterey Jack,\n" +
                "black beans, green onions, and garlic and season with salt.\n" +
                "4. Fill baked potatoes with mixture and place on a large baking sheet. Top with remaining ½\n" +
                "cup of Monterey Jack. Bake until cheese is melty and outside is crispy, 15 minutes.\n" +
                "5. Top with tomatoes, avocado, jalapeño, and queso fresco before serving.");
        tb1cv19.put("ContentTwo", "");
        tb1cv19.put("ContentThree", "");
        tb1cv19.put("ConvertedCalories", "Nutrition (per serving): 86 calories, 1.6 g protein, 20 g carbohydrates, 3 g fiber,\n" +
                "2 g sugar, 32 g fat, 10 g saturated fat, 55 mg sodium");
        tb1cv19.put("Video", "");
        tb1cv19.put("Category", "5");
        tb1cv19.put("AssetOne", "hb3.png");
        tb1cv19.put("AssetTwo", "");
        tb1cv19.put("AssetThree", "");
        long tb1insertcv19 = db.insert(TABLE_NAME_1, null, tb1cv19);


        ContentValues tb1cv20 = new ContentValues();
        tb1cv20.put("RecipeTitle", "Crunch Salad");
        tb1cv20.put("ContentOne", "To me salads are 90% about texture and more often than not, I want that texture to be crunchy.\n" +
                "Whether it comes from a crispy lettuce such as iceberg, or the snap of a cucumber, I find salads\n" +
                "infinitely more enjoyable when they have some bite.\n" +
                "INGREDIENTS\n" +
                "FOR THE DRESSING\n" +
                "1 large bunch cilantro, roughly chopped\n" +
                "1 garlic clove, peeled\n" +
                "1/4 c. lime juice\n" +
                "1/2 tsp. honey\n" +
                "1/2 c. extra-virgin olive oil\n" +
                "Pinch of cumin, optional\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "FOR THE SALAD\n" +
                "1 (10 to 12-oz.) bunch lacinato kale, chopped or torn into small pieces\n" +
                "1/4 small green cabbage, chopped\n" +
                "1 granny smith apple, diced, about ¼”\n" +
                "3 Persian or kirby cucumbers, diced, about ¼”\n" +
                "2 stalks celery, diced, about ¼”\n" +
                "3 scallions, thinly sliced\n" +
                "1/3 c. cup roasted and unsalted peanuts, roughly chopped\n" +
                "1/3 c. cup roasted and unsalted seeds (such as sunflower or pumpkin)\n" +
                "3 oz. feta cheese, crumbled\n" +
                "Kosher Salt\n" +
                "DIRECTIONS\n" +
                "1. Make the dressing: Add cilantro, garlic, lime juice, and honey to a food processor or\n" +
                "blender. Blend until the cilantro has been chopped, then slowly stream in the olive oil\n" +
                "until you’ve reached your desired consistency. Season to taste with cumin, if using, and\n" +
                "salt and pepper.\n" +
                "2. Make the salad: Add kale to a large bowl along with a pinch of salt. Massage kale for 1\n" +
                "to 2 minutes until all the leaves are slightly darkened and have softened a bit. Add green\n" +
                "cabbage, apple, cucumber, celery, scallions, peanuts, seeds and feta. Pour over desired\n" +
                "amount of dressing");
        tb1cv20.put("ContentTwo", "");
        tb1cv20.put("ContentThree", "");
        tb1cv20.put("ConvertedCalories", "Nutrition (per serving): 457 calories, 3 g protein, 7 g carbohydrates, 5 g fiber,\n" +
                "0.3 g sugar, 19 g fat, 17 g saturated fat, 24 mg sodium");
        tb1cv20.put("Video", "");
        tb1cv20.put("Category", "5");
        tb1cv20.put("AssetOne", "hb4.png");
        tb1cv20.put("AssetTwo", "");
        tb1cv20.put("AssetThree", "");
        long tb1insertcv20 = db.insert(TABLE_NAME_1, null, tb1cv20);


        ContentValues tb1cv21 = new ContentValues();
        tb1cv21.put("RecipeTitle", "Baked Orange Chicken");
        tb1cv21.put("ContentOne", "There could be many reasons why you might not want to deep fry. You might want to eat\n" +
                "something a bit lighter, or like many of us on the Delish team, you are a bit lazy and don't want\n" +
                "to go through all the setup and cleanup. Well, this Baked Orange Chicken is just as delicious\n" +
                "and savory-sweet as the original without the added effort or calories. Serve along fluffy white\n" +
                "rice and some delicious broccoli or bok choy for a fantastic lunch meal.\n" +
                "‘\n" +
                "INGREDIENTS\n" +
                "2 c. all-purpose flour\n" +
                "2 large Eggs, beaten\n" +
                "2 c. panko bread crumbs\n" +
                "1 lb. boneless skinless chicken breasts, cut into chunks\n" +
                "kosher salt\n" +
                "Freshly ground black pepper\n" +
                "Juice and zest of 2 oranges\n" +
                "1/3 c. low-sodium soy sauce\n" +
                "1/4 c. honey\n" +
                "2 cloves garlic, minced\n" +
                "2 tsp. freshly grated ginger\n" +
                "2 tbsp. cornstarch\n" +
                "2 c. cooked jasmine rice\n" +
                "Sesame seeds, for garnish\n" +
                "Sliced green onions, for garnish\n" +
                "DIRECTIONS\n" +
                "1. Preheat oven to 400° and line a baking sheet with parchment.\n" +
                "2. Set up a dredging station with one bowl of flour, one of eggs, and one of panko. Dredge\n" +
                "the chicken in flour, then coat in eggs and cover in panko. Season generously with salt\n" +
                "and pepper.\n" +
                "3. Arrange chicken on parchment-lined baking sheet and bake until no longer pink, 18 to 20\n" +
                "minutes.\n" +
                "4. Meanwhile, make sauce: In a small saucepan over medium heat, combine orange juice,\n" +
                "soy sauce, honey, garlic, ginger, and cornstarch. Whisk until combined and cook until\n" +
                "thickened, about 5 minutes.\n" +
                "5. Transfer chicken to a large bowl and toss in orange sauce.\n" +
                "6. Serve over rice with orange zest, sesame seeds, and green onions.");
        tb1cv21.put("ContentTwo", "");
        tb1cv21.put("ContentThree", "");
        tb1cv21.put("ConvertedCalories", "Nutrition (per serving): 575 calories, 60 g protein, 81 g carbohydrates, 3 g\n" +
                "fiber, 2 g sugar, 4 g fat, 1 g saturated fat, 646 mg sodium");
        tb1cv21.put("Video", "");
        tb1cv21.put("Category", "6");
        tb1cv21.put("AssetOne", "hl1.png");
        tb1cv21.put("AssetTwo", "");
        tb1cv21.put("AssetThree", "");
        long tb1insertcv21 = db.insert(TABLE_NAME_1, null, tb1cv21);


        ContentValues tb1cv22 = new ContentValues();
        tb1cv22.put("RecipeTitle", "Air Fryer Fish");
        tb1cv22.put("ContentOne", "This recipe works well with any firm, mild white fish. Haddock, pollock, cod, halibut, flounder,\n" +
                "whiting, walleye–you get the idea. Cod is usually on the thicker side, so if you’re using a thinner\n" +
                "fish like whiting or flounder, just adjust the cook time. You'll know the fish is done when it can be\n" +
                "flaked with a fork.\n" +
                "Even if you sprung for a jumbo-sized air fryer, you'll want to work in batches to avoid\n" +
                "overcrowding the air fryer. Overcrowding means creating steam and steam is the enemy of\n" +
                "perfectly crispy fish.\n" +
                "To make sure the breading adheres to the fish when you bite into it, pop the breaded pieces into\n" +
                "the refrigerator for 10 minutes on a parchment-lined sheet tray while you make the tartar sauce.\n" +
                "Once it's chilled, if you see any spots that look wet or soaked through, sprinkle a pinch of panko\n" +
                "on the wet spot and pat gently before frying.\n" +
                "INGREDIENTS\n" +
                "1 lb. cod, cut into 4 strips\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "1/2 c. all-purpose flour\n" +
                "1 large egg, beaten\n" +
                "2 c. panko bread crumbs\n" +
                "1 tsp. Old Bay seasoning\n" +
                "Lemon wedges, for serving\n" +
                "Tartar sauce, for serving\n" +
                "DIRECTIONS\n" +
                "1. Pat fish dry and season on both sides with salt and pepper.\n" +
                "2. Place flour, egg, and panko in three shallow bowls. Add Old Bay to panko and toss to\n" +
                "combine. Working one at a time, coat fish in flour, then in egg, and finally in panko,\n" +
                "pressing to coat.\n" +
                "3. Working in batches, place fish in basket of air fryer and cook at 400° for 10 to 12\n" +
                "minutes, gently flipping halfway through, or until fish is golden and flakes easily with a\n" +
                "fork.\n" +
                "4. Serve with lemon wedges and tartar sauce.");
        tb1cv22.put("ContentTwo", "");
        tb1cv22.put("ContentThree", "");
        tb1cv22.put("ConvertedCalories", "Nutrition (per serving): 601 calories, 50 g protein, 85 g carbohydrates, 3 g\n" +
                "fiber, 2 g sugar, 4 g fat, 1 g saturated fat, 846 mg sodium");
        tb1cv22.put("Video", "");
        tb1cv22.put("Category", "6");
        tb1cv22.put("AssetOne", "hl2.png");
        tb1cv22.put("AssetTwo", "");
        tb1cv22.put("AssetThree", "");
        long tb1insertcv22 = db.insert(TABLE_NAME_1, null, tb1cv22);


        ContentValues tb1cv23 = new ContentValues();
        tb1cv23.put("RecipeTitle", "Vegan Meatloaf");
        tb1cv23.put("ContentOne", "This hearty \"meat loaf\" is packed with veggies and protein. We're in love! Serve it with a side of\n" +
                "rosemary roasted potatoes and oven-roasted brussels sprouts for a truly delicious (and suuuper\n" +
                "nutritious) vegan feast!\n" +
                "INGREDIENTS\n" +
                "1 tbsp. extra-virgin olive oil\n" +
                "1/2 yellow onion, finely chopped\n" +
                "2 stalks celery, finely chopped\n" +
                "1 medium carrot, peeled and finely chopped\n" +
                "1 c. finely chopped baby bella mushrooms\n" +
                "2 (15-oz) cans chickpeas, drained and rinsed\n" +
                "1 c. panko bread crumbs\n" +
                "1/4 c. freshly chopped parsley, plus more for garnish\n" +
                "2 tbsp. low-sodium soy sauce\n" +
                "1 tbsp. vegan Worcestershire sauce\n" +
                "1/4 c. ketchup\n" +
                "1/4 c. barbecue sauce\n" +
                "1/2 tsp. smoked paprika\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "DIRECTIONS\n" +
                "1. Preheat oven to 375º and line an 5\"-x-8\" loaf pan with parchment paper. In a large skillet\n" +
                "over medium heat, heat oil. Add onion, celery, carrot, and mushrooms and cook, stirring\n" +
                "occasionally, until vegetables are soft and most of the liquid has cooked out, 6 to 8\n" +
                "minutes.\n" +
                "2. Using a potato masher in a large bowl or food processor, mash the chickpeas until a\n" +
                "rough paste forms. (A few large pieces of chickpea are OK.) Transfer to a large bowl if\n" +
                "using a food processor.\n" +
                "3. Add cooked vegetables, bread crumbs, parsley, soy sauce, and Worcestershire sauce to\n" +
                "the bowl with chickpeas. In a medium bowl, whisk together ketchup and barbecue sauce.\n" +
                "Add half of this mixture to the bowl with the chickpeas. Season with paprika, salt, and\n" +
                "pepper, and stir until all ingredients are evenly incorporated.\n" +
                "4. Transfer chickpea mixture to prepared loaf pan, packing the mixture in gently. Smooth\n" +
                "top, then brush with half of the remaining ketchup mixture and bake for 30 minutes.\n" +
                "Remove from oven, brush with remaining ketchup mixture, and bake 30 minutes more.\n" +
                "5. Let cool 10 minutes, then garnish with parsley and serve");
        tb1cv23.put("ContentTwo", "");
        tb1cv23.put("ContentThree", "");
        tb1cv23.put("ConvertedCalories", "Nutrition (per serving): 298 calories, 35 g protein, 38 g carbohydrates, 3 g\n" +
                "fiber, 2 g sugar, 4 g fat, 1 g saturated fat, 143 mg sodium");
        tb1cv23.put("Video", "");
        tb1cv23.put("Category", "6");
        tb1cv23.put("AssetOne", "hl3.png");
        tb1cv23.put("AssetTwo", "");
        tb1cv23.put("AssetThree", "");
        long tb1insertcv23 = db.insert(TABLE_NAME_1, null, tb1cv23);


        ContentValues tb1cv24 = new ContentValues();
        tb1cv24.put("RecipeTitle", "Lemon Pepper Chicken");
        tb1cv24.put("ContentOne", "Chicken breast recipes have a bad rep for being bland. If you throw chicken into a pan with salt\n" +
                "and pepper and bake it for forever, of course it's going to be terrible. I know this sounds obvious,\n" +
                "but it's what so many people trying to \"eat healthy\" do. On the other hand, when you add layers\n" +
                "of bright and fresh flavors (like lemon pepper!), eating healthy can be extremely easy and\n" +
                "delicious.\n" +
                "INGREDIENTS\n" +
                "1/2 c. all-purpose flour\n" +
                "1 tbsp. lemon pepper seasoning\n" +
                "1 tsp. kosher salt\n" +
                "2 lemons, divided\n" +
                "1 lb. boneless skinless chicken breasts, halved\n" +
                "2 tbsp. extra-virgin olive oil\n" +
                "1/2 c. Chicken broth Swanson Chicken Broth\n" +
                "2 tbsp. butter\n" +
                "2 cloves garlic, minced\n" +
                "Freshly chopped parsley, for garnish\n" +
                "DIRECTIONS\n" +
                "FOR OVEN\n" +
                "1. Preheat oven to 400°. In a medium bowl, whisk together flour, lemon pepper, salt, and\n" +
                "zest of 1 lemon. Toss chicken breasts in the flour mixture until fully coated. Slice\n" +
                "remaining lemon into thin rounds.\n" +
                "2. In a large ovenproof skillet over medium-high heat, heat oil. Add chicken in a single layer\n" +
                "and cook until golden on bottom, about 5 minutes, then flip chicken breasts.\n" +
                "3. To skillet, add broth, butter, garlic, and lemon slices and bake until chicken is cooked\n" +
                "through and sauce has reduced slightly, about 5 minutes.\n" +
                "4. Spoon sauce on top of chicken and garnish with parsley.\n" +
                "FOR STOVETOP\n" +
                "1. In a medium bowl, whisk together flour, lemon pepper, salt, and zest of 1 lemon. Toss\n" +
                "chicken breasts in the flour mixture until fully coated. Slice remaining lemon into thin\n" +
                "rounds.\n" +
                "2. In a large ovenproof skillet over medium-high heat, heat oil. Add chicken in a single layer\n" +
                "and cook until golden on bottom, about 5 minutes, then flip chicken breasts.\n" +
                "3. To skillet, add broth, butter, garlic, and lemon slices and cook until chicken is cooked\n" +
                "through and sauce has reduced slightly, 3 minutes.\n" +
                "4. Spoon sauce on top of chicken and garnish with parsley.");
        tb1cv24.put("ContentTwo", "");
        tb1cv24.put("ContentThree", "");
        tb1cv24.put("ConvertedCalories", "Nutrition (per serving): 458 calories, 87 g protein, 46 g carbohydrates, 5 g\n" +
                "fiber, 4 g sugar, 10 fat, 34 g saturated fat, 443 mg sodium");
        tb1cv24.put("Video", "");
        tb1cv24.put("Category", "6");
        tb1cv24.put("AssetOne", "hl4.png");
        tb1cv24.put("AssetTwo", "");
        tb1cv24.put("AssetThree", "");
        long tb1insertcv24 = db.insert(TABLE_NAME_1, null, tb1cv24);


        ContentValues tb1cv25 = new ContentValues();
        tb1cv25.put("RecipeTitle", "Honey Garlic Glazed Salmon");
        tb1cv25.put("ContentOne", "this savory-sweet salmon never disappoints. Searing fish might seem intimidating but, once you\n" +
                "get the hang of it, it'll be second nature. Just follow these easy tips:\n" +
                "Check for bones\n" +
                "The average pack of portioned super market salmon typically doesn't have any remaining pin\n" +
                "bones to worry about. But it's definitely best practice to double check. if you cut your portions\n" +
                "from a larger filet, the chance of finding a pin bone or two is higher. To check for bones, gently\n" +
                "run your fingers along the surface of the fish until you feel a slight prick. Using a pair of kitchen\n" +
                "or fish tweezers, firmly grip the bone and pull in the direction that it's naturally pointing.\n" +
                "Seriously hot pan\n" +
                "Like screaming hot. It's important that you get your pan hot and the bottom of your pan\n" +
                "thoroughly coated in oil. Once the fish hits the oil, you should hear a sizzle. If you don't, your\n" +
                "pan isn't hot enough.\n" +
                "INGREDIENTS\n" +
                "1/3 c. honey\n" +
                "1/4 c. low-sodium soy sauce\n" +
                "2 tbsp. lemon juice\n" +
                "1 tsp. red pepper flakes\n" +
                "3 tbsp. extra-virgin olive oil, divided\n" +
                "4 6-oz. salmon fillets, patted dry with a paper towel\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "3 cloves garlic, minced\n" +
                "1 lemon, sliced into rounds\n" +
                "DIRECTIONS\n" +
                "1. In a medium bowl, whisk together honey, soy sauce, lemon juice and red pepper flakes.\n" +
                "2. In a large skillet over medium-high heat, heat two tablespoons oil. When oil is hot but not\n" +
                "smoking, add salmon skin-side up and season with salt and pepper. Cook salmon until\n" +
                "deeply golden, about 6 minutes, then flip over and add remaining tablespoon of oil.\n" +
                "3. Add garlic to the skillet and cook until fragrant, 1 minute. Add the honey mixture and\n" +
                "sliced lemons and cook until sauce is reduced by about 1/3. Baste salmon with the\n" +
                "sauce.\n" +
                "4. Garnish with sliced lemon and serve.");
        tb1cv25.put("ContentTwo", "");
        tb1cv25.put("ContentThree", "");
        tb1cv25.put("ConvertedCalories", "Nutrition (per serving): 399 calories, 36 g protein, 26 g carbohydrates, .6 g\n" +
                "fiber, 23 g sugar, 17 g fat, 3 g saturated fat, 902 mg sodium");
        tb1cv25.put("Video", "");
        tb1cv25.put("Category", "7");
        tb1cv25.put("AssetOne", "hd1.png");
        tb1cv25.put("AssetTwo", "");
        tb1cv25.put("AssetThree", "");
        long tb1insertcv25 = db.insert(TABLE_NAME_1, null, tb1cv25);


        ContentValues tb1cv26 = new ContentValues();
        tb1cv26.put("RecipeTitle", "Chicken Primavera Spaghetti Squash Boats");
        tb1cv26.put("ContentOne", "Spaghetti squash turns one of favorite pasta dishes into a gluten-free, low-carb treat! The\n" +
                "perfect dinner to keep things fresh.\n" +
                "INGREDIENTS\n" +
                "FOR SPAGHETTI SQUASH\n" +
                "1 medium spaghetti squash, halved, seeds removed\n" +
                "1 tbsp. extra-virgin olive oil\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "FOR PRIMAVERA FILLING\n" +
                "1 tbsp. extra-virgin olive oil\n" +
                "1/2 small red onion, chopped\n" +
                "1 orange bell pepper, chopped\n" +
                "1 c. grape tomatoes, halved\n" +
                "1 medium zucchini, cut into half-moons\n" +
                "2 cloves garlic, minced\n" +
                "1 tsp. lemon zest\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "1/2 tsp. Italian seasoning\n" +
                "2 1/2 c. cooked shredded chicken\n" +
                "1 c. shredded mozzarella\n" +
                "1/4 c. freshly grated Parmesan\n" +
                "Freshly chopped parsley, for garnish\n" +
                "DIRECTIONS\n" +
                "1. Preheat oven to 400°. Drizzle cut sides of spaghetti squash with oil and season with salt\n" +
                "and pepper. Place cut side down on a large, rimmed baking sheet. Roast until tender, 30\n" +
                "to 35 minutes. Let cool slightly. Using a fork, break up squash strands. Keep oven on.\n" +
                "2. Meanwhile, make filling: In a large skillet over medium heat, heat oil. Add onions and bell\n" +
                "pepper and cook until slightly softened, 3 to 4 minutes. Add tomatoes, zucchini, garlic,\n" +
                "and lemon zest. Season with salt, pepper, and Italian seasoning and stir until combined.\n" +
                "Cook until soft, 3 to 4 minutes. Stir in shredded chicken. Remove from heat.\n" +
                "3. Divide mixture between squash halves and stir to combine with squash strands. Top\n" +
                "each half with mozzarella and return to oven to melt, 5 minutes.\n" +
                "4. Garnish with Parmesan and parsley before serving.");
        tb1cv26.put("ContentTwo", "");
        tb1cv26.put("ContentThree", "");
        tb1cv26.put("ConvertedCalories", "Nutrition (per serving): 389 calories, 36 g protein, 26 g carbohydrates, .6 g\n" +
                "fiber, 23 g sugar, 17 g fat, 3 g saturated fat, 902 mg sodium");
        tb1cv26.put("Video", "");
        tb1cv26.put("Category", "7");
        tb1cv26.put("AssetOne", "hd2.png");
        tb1cv26.put("AssetTwo", "");
        tb1cv26.put("AssetThree", "");
        long tb1insertcv26 = db.insert(TABLE_NAME_1, null, tb1cv26);


        ContentValues tb1cv27 = new ContentValues();
        tb1cv27.put("RecipeTitle", "Seared Ahi Tuna & Arugula Pear Salad");
        tb1cv27.put("ContentOne", "If it wasn't already obvious, the most important part of this recipe is the fish. Make sure you're\n" +
                "getting quality sushi-grade Ahi Tuna—it tastes MUCH better raw than your average grocery\n" +
                "store cut of tuna. Remember: frozen sushi-grade fish doesn't mean its not fresh. In fact, in many\n" +
                "cases that fish was frozen at the height of freshness and will make for a delicious and flavorful\n" +
                "piece of seared tuna. Consulting your local fish monger is the best way to get a great piece of\n" +
                "fish, so don't be shy. \uD83D\uDE0A With just a quick sear, this dish is fast and so easy to make on a busy\n" +
                "weeknight even though it feels extra special.\n" +
                "INGREDIENTS\n" +
                "FOR TUNA STEAKS\n" +
                "2 (4-6 oz.) ahi tuna steaks\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "2 tbsp. black sesame seeds\n" +
                "2 tbsp. white sesame seeds\n" +
                "1 tbsp. vegetable oil\n" +
                "FOR DRESSING\n" +
                "Juice of 1 lime (or about 3 tablespoons)\n" +
                "2 tbsp. extra-virgin olive oil\n" +
                "2 tsp. toasted sesame oil\n" +
                "2 tsp. freshly grated ginger\n" +
                "1 tsp. Honey\n" +
                "FOR SALAD\n" +
                "4 c. loosely packed arugula\n" +
                "1/2 Asian pear, thinly sliced\n" +
                "2 Radishes, thinly sliced\n" +
                "1 Persian cucumber, thinly sliced\n" +
                "DIRECTIONS\n" +
                "1. Season tuna steaks all over with salt and pepper. Combine black and white sesame\n" +
                "seeds on a shallow plate, then gently press tuna steaks into seeds to coat them on all\n" +
                "sides.\n" +
                "2. In a medium skillet over medium-high heat, heat oil until hot. Add tuna steaks to the pan\n" +
                "and sear 30 seconds to 1 minute per side, depending on desired doneness. Transfer to\n" +
                "a cutting board.\n" +
                "3. Make salad: In a medium bowl, whisk together dressing ingredients. Season with salt\n" +
                "and pepper.\n" +
                "4. In a large bowl, combine all salad ingredients. Add dressing and toss gently. Slice tuna.\n" +
                "5. Divide salad between plates and top with tuna.");
        tb1cv27.put("ContentTwo", "");
        tb1cv27.put("ContentThree", "");
        tb1cv27.put("ConvertedCalories", "Nutrition (per serving): 689 calories, 36 g protein, 26 g carbohydrates, .6 g\n" +
                "fiber, 23 g sugar, 17 g fat, 3 g saturated fat, 902 mg sodium");
        tb1cv27.put("Video", "");
        tb1cv27.put("Category", "7");
        tb1cv27.put("AssetOne", "hd3.png");
        tb1cv27.put("AssetTwo", "");
        tb1cv27.put("AssetThree", "");
        long tb1insertcv27 = db.insert(TABLE_NAME_1, null, tb1cv27);


        ContentValues tb1cv28 = new ContentValues();
        tb1cv28.put("RecipeTitle", "Air Fryer Fried Chicken");
        tb1cv28.put("ContentOne", "Imagine the best fried chicken you've ever had. Now imagine if it wasn't even fried. Crazy, right?\n" +
                "Not with this easy air-fryer fried chicken recipe! The air fryer works some kind of magic on the\n" +
                "chicken, and it crisps up into perfectly crunchy chicken as if it had been deep-fried. That\n" +
                "buttermilk marinade makes the chicken so tender and juicy and gives it just the right amount of\n" +
                "heat. It might just be our favorite chicken recipe ever.\n" +
                "INGREDIENTS\n" +
                "2 lb. skin-on, bone-in chicken pieces (a mix of cuts)\n" +
                "2 c. buttermilk\n" +
                "1/2 c. hot sauce\n" +
                "3 tsp. kosher salt, divided\n" +
                "2 c. all-purpose flour\n" +
                "1 tsp. garlic powder\n" +
                "1 tsp. onion powder\n" +
                "1/2 tsp. dried oregano\n" +
                "1/2 tsp. freshly ground black pepper\n" +
                "1/4 tsp. cayenne pepper\n" +
                "DIRECTIONS\n" +
                "1. Trim chicken of any excess fat and transfer to a large bowl. In a medium bowl, combine\n" +
                "buttermilk, hot sauce, and 2 teaspoons salt. Pour buttermilk mixture over chicken,\n" +
                "making sure all pieces are coated. Cover bowl and refrigerate at least 1 hour or up to\n" +
                "overnight.\n" +
                "2. In a shallow bowl or pie dish, combine flour, garlic powder, onion powder, oregano, black\n" +
                "pepper, cayenne, and remaining 1 teaspoon salt. Working one at a time, remove chicken\n" +
                "from buttermilk mixture, shaking off any excess. Place in flour mixture, turning to coat.\n" +
                "3. Working in batches if necessary, in an air-fryer basket, arrange chicken (do not\n" +
                "overcrowd). Cook at 400°, turning halfway through, until chicken is golden brown and an\n" +
                "instant-read thermometer inserted into thickest part registers 165°, 20 to 25 minutes.");
        tb1cv28.put("ContentTwo", "");
        tb1cv28.put("ContentThree", "");
        tb1cv28.put("ConvertedCalories", "Nutrition (per serving): 609 calories, 48 g protein, 52 g carbohydrates, 2 g\n" +
                "fiber, 3 g sugar, 22 g fat, 7 g saturated fat, 1,346 mg sodium");
        tb1cv28.put("Video", "");
        tb1cv28.put("Category", "7");
        tb1cv28.put("AssetOne", "hd4.png");
        tb1cv28.put("AssetTwo", "");
        tb1cv28.put("AssetThree", "");
        long tb1insertcv28 = db.insert(TABLE_NAME_1, null, tb1cv28);


        ContentValues tb1cv29 = new ContentValues();
        tb1cv29.put("RecipeTitle", "Zucchini Lattice Lasagna");
        tb1cv29.put("ContentOne", "Sure, classic lasagna is delicious. Sometimes, though, we crave something a tad less\n" +
                "carb-heavy. This zucchini lattice lasagna is the perfect way to lighten up the classic dish for\n" +
                "summer. Pro tip: Zucchini releases a good amount of water, so we like to dab it with a paper\n" +
                "towel when the lasagna is done cooking, and then broil until the cheese is bubbly and crispy. \uD83D\uDE0D\n" +
                "INGREDIENTS\n" +
                "2 c. ricotta\n" +
                "1 c. freshly grated Parmesan, plus more for sprinkling\n" +
                "2 large eggs\n" +
                "Kosher salt\n" +
                "Freshly ground black pepper\n" +
                "1 1/2 c. marinara sauce\n" +
                "3 large zucchini, cut into wide strips using a Y peeler and drained on paper towels\n" +
                "3 c. shredded mozzarella\n" +
                "DIRECTIONS\n" +
                "1. Preheat oven to 350°. In a small bowl, stir together ricotta, Parmesan, and eggs and\n" +
                "season mixture with salt and pepper.\n" +
                "2. Spread a thin layer of marinara in a baking dish. Cover with 2 layers of zucchini, a third\n" +
                "of the ricotta mixture, and a third of the mozzarella. Spread about 1/3 cup marinara over\n" +
                "mozzarella. Repeat layering twice more.\n" +
                "3. For the top, layer zucchini noodles side by side on a diagonal in the baking dish to make\n" +
                "a lattice. Lift the bottom half of every other noodle and lay another zucchini noodle\n" +
                "across diagonally. Repeat until full.\n" +
                "4. Sprinkle with more Parmesan and season with salt and pepper.\n" +
                "5. Bake until melty and zucchini is cooked through, 30 minutes.\n" +
                "6. Let rest for 10 minutes before slicing.");
        tb1cv29.put("ContentTwo", "");
        tb1cv29.put("ContentThree", "");
        tb1cv29.put("ConvertedCalories", "snacks1.png");
        tb1cv29.put("Video", "");
        tb1cv29.put("Category", "8");
        tb1cv29.put("AssetOne", "hs1.png");
        tb1cv29.put("AssetTwo", "");
        tb1cv29.put("AssetThree", "");
        long tb1insertcv29 = db.insert(TABLE_NAME_1, null, tb1cv29);


        ContentValues tb1cv30 = new ContentValues();
        tb1cv30.put("RecipeTitle", "Taco Tomatoes");
        tb1cv30.put("ContentOne", "We're all for a genius low-carb hack — and these tomatoes totally deliver. We had never thought\n" +
                "to stuff them with taco meat, cheese, and sour cream, but we'll do anything in the name of\n" +
                "ditching a tortilla for a low-carb meal. You can change up the fillings for cheeseburger tomatoes,\n" +
                "too.\n" +
                "INGREDIENTS\n" +
                "1 tbsp. extra-virgin olive oil\n" +
                "3/4 lb. ground beef\n" +
                "1 medium onion, chopped\n" +
                "1 (1-oz.) packet taco seasoning\n" +
                "4 large, ripe beefsteak tomatoes\n" +
                "1/2 c. shredded Mexican cheese blend\n" +
                "1/2 c. shredded iceberg lettuce\n" +
                "1/4 c. sour cream\n" +
                "DIRECTIONS\n" +
                "1. In a large skillet over medium heat, heat oil. Add onion and cook, stirring, until soft, 5\n" +
                "minutes. Add ground beef and taco seasoning. Cook, breaking up meat with a wooden\n" +
                "spoon, until no longer pink, 8 minutes. Drain fat.\n" +
                "2. Flip over tomatoes so they’re stem-side down and slice to make 6 wedges, being careful\n" +
                "not to cut all the way through. Carefully spread open wedges.\n" +
                "3. Divide taco meat among tomatoes, then top each with cheese, lettuce, and sour cream\n" +
                "before serving.");
        tb1cv30.put("ContentTwo", "");
        tb1cv30.put("ContentThree", "");
        tb1cv30.put("ConvertedCalories", "snacks2.png");
        tb1cv30.put("Video", "");
        tb1cv30.put("Category", "8");
        tb1cv30.put("AssetOne", "hs2.png");
        tb1cv30.put("AssetTwo", "");
        tb1cv30.put("AssetThree", "");
        long tb1insertcv30 = db.insert(TABLE_NAME_1, null, tb1cv30);


        ContentValues tb1cv31 = new ContentValues();
        tb1cv31.put("RecipeTitle", "Black Bean Tostadas");
        tb1cv31.put("ContentOne", "With only 5 ingredients these black bean tostadas are the easiest and fastest meal to throw\n" +
                "together. You can always add on additional toppings like corn salsa, avocado ranch, or endless\n" +
                "crunchy veggies like radishes or pickled red onions, but here we keep things simple. With\n" +
                "ingredients you're likely to have on hand, these tostadas make for a last minute, easy meal\n" +
                "you'll have on repeat.\n" +
                "INGREDIENTS\n" +
                "2 (15-oz.) cans black beans, rinsed and drained\n" +
                "8 tostadas\n" +
                "2 c. shredded pepper jack\n" +
                "Avocado, sliced\n" +
                "Hot sauce\n" +
                "DIRECTIONS\n" +
                "1. Preheat oven to 350°. In a small saucepan over medium heat, add beans and 1 cup of\n" +
                "water. Bring to a simmer and let simmer until beans are warmed through, about 10\n" +
                "minutes. Smash with a wooden spoon until most of the beans are smashed with some\n" +
                "whole remaining. Add more water as needed to help create a smoother consistency.\n" +
                "2. Meanwhile, place tostadas on a large baking sheet and sprinkle cheese evenly over\n" +
                "each. Bake until cheese is melty, about 5 minutes.\n" +
                "3. Top tostadas with beans, avocado slices, and hot sauce.");
        tb1cv31.put("ContentTwo", "");
        tb1cv31.put("ContentThree", "");
        tb1cv31.put("ConvertedCalories", "snacks3.png");
        tb1cv31.put("Video", "");
        tb1cv31.put("Category", "8");
        tb1cv31.put("AssetOne", "hs3.png");
        tb1cv31.put("AssetTwo", "");
        tb1cv31.put("AssetThree", "");
        long tb1insertcv31 = db.insert(TABLE_NAME_1, null, tb1cv31);


        ContentValues tb1cv32 = new ContentValues();
        tb1cv32.put("RecipeTitle", "Cauliflower Pizza Crust");
        tb1cv32.put("ContentOne", "Cauliflower has invaded kitchens everywhere. As a healthy, blank slate it has taken the form of\n" +
                "mashed potatoes, toasty bread and even the center of our Thanksgiving table. Possibly our\n" +
                "favorite use of cauliflower as a culinary master of disguise is in pizza crust. It might sound crazy\n" +
                "but it can be a delicious and healthy alternative to the classic. In this easy, gluten-free pizza\n" +
                "recipe, you're basically making cauliflower rice as base the base for your crust.\n" +
                "Test Kitchen Tip: You MUST drain the cooked cauliflower, as it keeps the crust dry and\n" +
                "encourages crisping while it bakes.\n" +
                "Topping Variations: Keep things simple with fresh tomatoes and basil, or get creative. Sautéed\n" +
                "peppers and onions, sliced olives, cooked and crumbled sausage. Ham and pineapple? Why\n" +
                "not! And pepperoni is always a good call—and you can even buy a vegan version if someone at\n" +
                "your table doesn’t eat meat.\n" +
                "INGREDIENTS\n" +
                "1 large head cauliflower, roughly chopped\n" +
                "1 large egg\n" +
                "2 c. shredded mozzarella, divided\n" +
                "1/2 c. freshly grated Parmesan, divided\n" +
                "kosher salt\n" +
                "1/4 c. marinara or pizza sauce\n" +
                "2 cloves garlic, minced\n" +
                "1 c. grape or cherry tomatoes, halved\n" +
                "Torn fresh basil, for serving\n" +
                "Balsamic glaze, for drizzling\n" +
                "DIRECTIONS\n" +
                "1. Preheat oven to 425°. In a large skillet, bring about 1/4\" water to a boil. Season with salt.\n" +
                "Add cauliflower in one even layer and cook until crisp-tender, 3 to 4 minutes. Transfer to\n" +
                "a clean dish towel (or paper towels) and squeeze to drain water.\n" +
                "2. Add drained cauliflower to food processor and pulse until grated. Drain excess water in\n" +
                "paper towels.\n" +
                "3. Transfer drained cauliflower to a large bowl and add egg, 1 cup mozzarella and 1/4 cup\n" +
                "Parmesan, then season with salt.\n" +
                "4. Transfer dough to a baking sheet lined with cooking spray and pat into a crust. Bake until\n" +
                "golden and dried out, 20 minutes.\n" +
                "5. Top crust with marinara, remaining mozzarella and Parm, garlic and tomatoes and bake\n" +
                "until cheese is melted and crust is crisp, 10 minutes more.\n" +
                "6. Garnish with basil and drizzle with balsamic glaze.");
        tb1cv32.put("ContentTwo", "");
        tb1cv32.put("ContentThree", "");
        tb1cv32.put("ConvertedCalories", "snacks4.png");
        tb1cv32.put("Video", "");
        tb1cv32.put("Category", "8");
        tb1cv32.put("AssetOne", "hs4.png");
        tb1cv32.put("AssetTwo", "");
        tb1cv32.put("AssetThree", "");
        long tb1insertcv32 = db.insert(TABLE_NAME_1, null, tb1cv32);


        ContentValues tb1cv33 = new ContentValues();
        tb1cv33.put("RecipeTitle", "Roasted Hazelnut & Pistachio Bark");
        tb1cv33.put("ContentOne", "This decadent dessert is made from just three ingredients: dark chocolate, flaky salt, and\n" +
                "toasted nuts. The darker the chocolate, the less sugar is in it!\n" +
                "INGREDIENTS\n" +
                "1/2 c. roasted pistachios, divided\n" +
                "1/2 c. roasted hazelnuts, divided\n" +
                "3 (3.5-ounce) bars 72% dark chocolate, chopped\n" +
                "1/3 tsp. flaky sea salt\n" +
                "DIRECTIONS\n" +
                "1. Line a rimmed baking sheet with parchment paper. Chop 1/4 cup each pistachio and\n" +
                "hazelnuts. Place chocolate in a heatproof bowl; set over, not in, a pot of simmering\n" +
                "water. Cook, stirring occasionally, until chocolate is melted. Stir in chopped nuts.\n" +
                "2. Pour the chocolate mixture on a prepared baking sheet and spread to a 10-inch circle.\n" +
                "Sprinkle with remaining 1/4 cup each whole pistachios and hazelnuts. Sprinkle with flaky\n" +
                "salt. Refrigerate, until chocolate is hard, about 1 hour. Break into pieces before serving.");
        tb1cv33.put("ContentTwo", "");
        tb1cv33.put("ContentThree", "");
        tb1cv33.put("ConvertedCalories", "dessert1.png");
        tb1cv33.put("Video", "");
        tb1cv33.put("Category", "9");
        tb1cv33.put("AssetOne", "d1.png");
        tb1cv33.put("AssetTwo", "");
        tb1cv33.put("AssetThree", "");
        long tb1insertcv33 = db.insert(TABLE_NAME_1, null, tb1cv33);


        ContentValues tb1cv34 = new ContentValues();
        tb1cv34.put("RecipeTitle", "Brandied Strawberry Shortcakes with Malted Whipped Cream");
        tb1cv34.put("ContentOne", "You can cut back on the sugar to make this simple dessert even healthier—or skip the whipped\n" +
                "cream and use yogurt instead!\n" +
                "INGREDIENTS\n" +
                "For the brandied strawberries:\n" +
                "2 (16-ounce) containers strawberries, trimmed and quartered\n" +
                "1/2 c. granulated sugar\n" +
                "1/4 c. Cognac or other aged brandy\n" +
                "For the biscuits:\n" +
                "4 c. “00” Pizza Flour (or 2 2/3 cups all-purpose flour and 1 1/3 cups cake flour), plus more for\n" +
                "work surface\n" +
                "3/4 c. granulated sugar\n" +
                "1 1/2 tsp. kosher salt\n" +
                "4 tsp. baking powder\n" +
                "1 tsp. baking soda\n" +
                "3/4 c. (1 1/2 sticks) cold unsalted butter\n" +
                "1 1/2 c. buttermilk\n" +
                "Turbinado sugar, for sprinkling\n" +
                "For the whipped cream:\n" +
                "2 c. heavy cream\n" +
                "2 tbsp. granulated sugar\n" +
                "1/2 tsp. pure vanilla extract\n" +
                "2 tbsp. malted milk powder\n" +
                "DIRECTIONS\n" +
                "1. Make the strawberries: Mash one-fourth of the strawberries with the back of a fork in a\n" +
                "bowl. Stir in remaining berries, granulated sugar, and cognac. Cover and refrigerate at\n" +
                "least 30 minutes and up to 3 hours.\n" +
                "2. Make the biscuits: Preheat oven to 450°F. Sift together flour, granulated sugar, salt,\n" +
                "baking powder, and baking soda in a bowl. Cut in butter using two forks or a pastry\n" +
                "blender until it forms pea-size pieces. Stir in buttermilk and gently mix until a shaggy ball\n" +
                "forms.\n" +
                "3. Turn dough out onto a lightly floured work surface. With floured hands, knead 2 to 3\n" +
                "times. Pat or roll into a 1-inch-thick circle. Cut dough into 4 wedges and stack the pieces\n" +
                "on top of each other. Roll again into a 1-inch-thick circle. Repeat 2 more times.\n" +
                "4. Cut biscuits with a 2 1/2-inch round cutter; re-roll scraps. Place on a baking sheet,\n" +
                "touching slightly. Sprinkle with turbinado sugar and freeze 15 minutes. Bake until golden\n" +
                "brown, 18 to 20 minutes. Transfer to a wire rack to cool.\n" +
                "5. Make the whipped cream: Beat cream, sugar, vanilla, and malted milk powder with an\n" +
                "electric mixer on medium speed until soft peaks form, 1 to 2 minutes.\n" +
                "6. Halve biscuits and top with berries and whipped cream, dividing evenly. Serve\n" +
                "immediately.");
        tb1cv34.put("ContentTwo", "");
        tb1cv34.put("ContentThree", "");
        tb1cv34.put("ConvertedCalories", "dessert2.png");
        tb1cv34.put("Video", "");
        tb1cv34.put("Category", "9");
        tb1cv34.put("AssetOne", "d2.png");
        tb1cv34.put("AssetTwo", "");
        tb1cv34.put("AssetThree", "");
        long tb1insertcv34 = db.insert(TABLE_NAME_1, null, tb1cv34);


        ContentValues tb1cv35 = new ContentValues();
        tb1cv35.put("RecipeTitle", "Strawberry-Almond Crumble Pie");
        tb1cv35.put("ContentOne", "Fresh fruit is always a good way to get a healthy sweet treat. Oat-based crumbles add a bit\n" +
                "more fiber than a standard pie crust topping.\n" +
                "INGREDIENTS\n" +
                "For the crust:\n" +
                "1/3 c. roasted whole almonds\n" +
                "1 tsp. granulated sugar\n" +
                "1 c. all-purpose flour, spooned and leveled\u0000\n" +
                "3/4 tsp. kosher salt\n" +
                "1/2 c. (1 stick) cold unsalted butter, cut into pieces\n" +
                "4 tbsp. ice water\n" +
                "For the almond crumble:\n" +
                "1/3 c. roasted whole almonds, finely chopped\n" +
                "1/3 c. rolled oats\n" +
                "1/3 c. all-purpose flour, spooned and leveled, plus more for work surface\n" +
                "1/2 c. packed light brown sugar\n" +
                "1/2 tsp. lemon zest\n" +
                "1/2 tsp. kosher salt\n" +
                "6 tbsp. (3/4 stick) cold unsalted butter, cut into pieces\n" +
                "For the filling:\n" +
                "1/2 c. granulated sugar\n" +
                "1/4 tsp. ground nutmeg\n" +
                "1/4 tsp. ground cardamom\n" +
                "1/3 c. cornstarch\n" +
                "1/4 tsp. kosher salt\n" +
                "1 tbsp. fresh lemon juice\n" +
                "2 lb. strawberries, hulled and halved if small or quartered if large\n" +
                "DIRECTIONS\n" +
                "1. Make the crust: Pulse almonds in a food processor until finely ground, 15 to 18 times.\n" +
                "Add sugar, flour, and salt, and pulse to combine. Add butter, and pulse until it resembles\n" +
                "coarse meal with several pea-size pieces remaining, 6 to 8 times. Add water, 1\n" +
                "tablespoon at a time, pulsing to pull dough together into a crumbly pile (add up to an\n" +
                "additional 1 tablespoon of water if needed).\n" +
                "2. Turn dough onto work surface and press into a ball; flatten into a disk. Wrap disk in\n" +
                "plastic and chill at least 2 hours or up to overnight.\n" +
                "3. Make the almond crumble: Combine almonds, oats, flour, brown sugar, lemon zest, and\n" +
                "salt in a bowl. Cut butter into flour mixture with two forks or a pastry blender until butter is\n" +
                "incorporated and mixture forms small clumps. Chill at least 1 hour or up to overnight.\n" +
                "4. Preheat oven to 375°F with one rack in the middle and one rack in the lowest position.\n" +
                "Line a rimmed baking sheet with foil. Roll out dough on a lightly floured surface to a\n" +
                "12-inch circle. Transfer to a 9-inch pie plate; fold edges under to align with the rim of the\n" +
                "plate and crimp; freeze 20 minutes. Line pie shell with aluminum foil and fill with pie\n" +
                "weights or dry beans. Bake, on lowest rack, until edges are set, 24 to 26 minutes.\n" +
                "Carefully remove foil and pie weights and prick bottom of pie shell several times with a\n" +
                "fork. Return to oven and bake until edges are golden brown and bottom is dry, 7 to 10\n" +
                "minutes. Cool completely on a wire rack; reserve baking sheet.\n" +
                "5. Make the filling: Increase oven temperature to 400°F. Combine sugar, nutmeg,\n" +
                "cardamom, cornstarch, and salt in a bowl. Add lemon juice and strawberries and toss to\n" +
                "coat. Spoon into parbaked pie shell, pressing berries into an even layer, and top with\n" +
                "crumble topping. Place on reserved baking sheet.\n" +
                "6. Bake, on middle rack, 30 minutes. Reduce oven temperature to 375°F, cover with\n" +
                "aluminum foil, and bake until juices are bubbly around the edges and streusel is deep\n" +
                "golden brown, 25 to 30 minutes. Transfer to a wire rack to cool completely, at least 2\n" +
                "hours.");
        tb1cv35.put("ContentTwo", "");
        tb1cv35.put("ContentThree", "");
        tb1cv35.put("ConvertedCalories", "dessert3.png");
        tb1cv35.put("Video", "");
        tb1cv35.put("Category", "9");
        tb1cv35.put("AssetOne", "d3.png");
        tb1cv35.put("AssetTwo", "");
        tb1cv35.put("AssetThree", "");
        long tb1insertcv35 = db.insert(TABLE_NAME_1, null, tb1cv35);


        ContentValues tb1cv36 = new ContentValues();
        tb1cv36.put("RecipeTitle", "Carrot-Nut Bread with Sour Cream Glaze");
        tb1cv36.put("ContentOne", "It's like a sneaky way of getting everyone to eat their vegetables!\n" +
                "INGREDIENTS\n" +
                "For the Bread:\n" +
                "Cooking spray\n" +
                "1/2 c. chopped walnuts or pecans\n" +
                "1 1/2 c. all-purpose flour, spooned and leveled\n" +
                "1 tsp. kosher salt\n" +
                "1 tsp. ground cinnamon\n" +
                "1/2 tsp. baking soda\n" +
                "1/4 tsp. baking powder\n" +
                "2 large eggs\n" +
                "1 c. packed dark brown sugar\n" +
                "1/2 c. canola oil\n" +
                "1/4 c. sour cream\n" +
                "2 c. grated carrots (from about 2 large carrots)\n" +
                "For the Glaze:\n" +
                "6 tbsp. confectioners’ sugar\n" +
                "1/4 c. sour cream\n" +
                "DIRECTIONS\n" +
                "1. Make cake: Preheat oven to 350°F. Lightly grease an 8 1/2-by-4 1/2-inch loaf pan; line\n" +
                "with parchment paper, leaving a 2-inch overhang on long sides. Spread walnuts on a\n" +
                "rimmed baking sheet and toast until fragrant, 5 to 7 minutes.\n" +
                "2. Whisk together flour, salt, cinnamon, baking soda, and baking powder in a bowl. Whisk\n" +
                "together eggs, brown sugar, oil, and sour cream in a second bowl. Add wet ingredients\n" +
                "to dry ingredients, and stir with a fork just until combined. Fold in carrots and walnuts.\n" +
                "Transfer batter to prepared pan; smooth top.\n" +
                "3. Bake until a toothpick inserted into center comes out clean, 1 hour to 1 hour and 10\n" +
                "minutes. Cool in pan on a wire rack 10 minutes.\n" +
                "4. Make glaze: Whisk together confectioners’ sugar and sour cream in a bowl until smooth.\n" +
                "Pour over cake, and cool completely in pan.");
        tb1cv36.put("ContentTwo", "");
        tb1cv36.put("ContentThree", "");
        tb1cv36.put("ConvertedCalories", "dessert4.png");
        tb1cv36.put("Video", "");
        tb1cv36.put("Category", "9");
        tb1cv36.put("AssetOne", "d4.png");
        tb1cv36.put("AssetTwo", "");
        tb1cv36.put("AssetThree", "");
        long tb1insertcv36 = db.insert(TABLE_NAME_1, null, tb1cv36);






        ContentValues tb2cv1 = new ContentValues();
        tb2cv1.put("Email", "alexandra.yumul@g.batstate-u.edu.ph");
        tb2cv1.put("FirstName", "Alexandra");
        tb2cv1.put("MiddleName", "Martija");
        tb2cv1.put("LastName", "Yumul");
        tb2cv1.put("Password", "12345678");
        long tb2insertcv1 = db.insert(TABLE_NAME_2, null, tb2cv1);

        ContentValues tb2cv2 = new ContentValues();
        tb2cv2.put("Email", "1");
        tb2cv2.put("FirstName", "Test");
        tb2cv2.put("MiddleName", "Test");
        tb2cv2.put("LastName", "Test");
        tb2cv2.put("Password", "1");
        long tb2insertcv2 = db.insert(TABLE_NAME_2, null, tb2cv2);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME_1);
        db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME_2);
        onCreate(db);
    }

    public Cursor getRecipes(String category) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME_1 + " where Category='"+category+"'",null);
        return res;
    }

    public Cursor searchRecipe(String search) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME_1 + " where RecipeTitle LIKE'%"+search+"%' OR ContentOne LIKE'%"+search+"%' OR ContentTwo LIKE'%"+search+"%'  OR ContentThree LIKE'%"+search+"%'",null);
        return res;
    }

    public Cursor getRecipe(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME_1 + " where id='"+id+"'",null);
        return res;
    }

}

