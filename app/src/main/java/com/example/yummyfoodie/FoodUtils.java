package com.example.yummyfoodie;

import java.util.ArrayList;
import java.util.List;

public class FoodUtils {
    private static final String[] food={
      "Stir-Fried Pork","pickled fish","Stewed Tofu with Cabbage","Chicken Curry","Garlic Steamed Shrimp","Eggplant Chicken Nuggets",
      "Fried Pork", "Candied Sweet Potatoes","Pork Belly and Beans","Pork and Leek Buns","Curry Beef Rice","Braised Fish with Radish",
      "Steamed Ribs","Pork Dumplings","Di San Xian"
    };
    private static final String[] food1={
            "Step：\n" +
                    "1、Prepare ingredients\n" +
                    "2、Peel and slice the arrowhead mushrooms\n" +
                    "3、Boil the water in the pot, add the mushrooms and blanch\n" +
                    "4、Add sugar, cooking wine, soy sauce and starch to the tenderloin slices and mix well\n" +
                    "5、Pour oil into the frying pan and sauté shallot and ginger, pour in sliced meat and stir-fry until the color changes\n" +
                    "6、Then pour in Cigu and stir fry evenly\n" +
                    "7、Add soy sauce\n" +
                    "8、Add sugar and salt and stir well.\n" +
                    "9、Add garlic sprouts and stir fry\n" +
                    "10、Put the fried meat slices into the stir fry\n" +
                    "11、water starch\n" +
                    "12、Pour in the sesame oil and stir fry evenly, turn off the fire",
            "Step：\n" +
                    "1、One fish, cleaned\n" +
                    "2、Sauerkraut, disassembled, washed and cut into sections\n" +
                    "3、Cut garlic slices, minced garlic leaves, and scallions\n" +
                    "4、Prepare fennel, pepper, red pepper\n" +
                    "5、Next deal with the herring. Lay the fish flat and run a knife from head to tail.\n" +
                    "6、Then make a flat knife cut from the tail to the head of the fish. seesaw forward\n" +
                    "7、Cut to the gills of the fish.\n" +
                    "8、Take the other half in the same way\n" +
                    "9、Then cut the bones and head and put it with sauerkraut\n" +
                    "10、Slice off the fishbone at the belly of the fish belly and cut into small pieces.\n" +
                    "11、Then, the angled knife begins to fillet the fish from the tail. Also go to the back piece in a saw-saw style.\n" +
                    "12、For the sliced fish, add an egg white, a spoonful of cornstarch, and a spoonful of oil.\n" +
                    "13、Add appropriate amount of pepper and salt.\n" +
                    "14、Then, knead well with your hands, press the clockwise direction, knead for a few minutes and let it stand for use\n" +
                    "15、Put oil in the pan, fry garlic slices, shallots, Chinese prickly ash, and dried peppers.\n" +
                    "16、Add sauerkraut and fish bones and stir fry.\n" +
                    "17、Add boiling water or bone broth. After boiling, add balsamic vinegar, salt, and light soy sauce, and simmer for about 15 minutes.\n" +
                    "18、Then take out the sauerkraut and fish bones\n" +
                    "19、After the fish fillets are cooked, take them out with a slotted spoon and place them in a basin.\n" +
                    "20、Then pour the soup over.\n" +
                    "21、Heat the oil on a clean pan\n" +
                    "22、Drizzle hot oil over top",
            "Step：\n" +
                    "1、Materials: Chinese cabbage, tofu.\n" +
                    "2、Cut cabbage into strips.\n" +
                    "3、Wash and drain.\n" +
                    "4、Heat oil in a pan, sauté chopped green onion.\n" +
                    "5、Put in the cabbage and stir-fry over medium heat until the cabbage collapses.\n" +
                    "6、Add appropriate amount of water.\n" +
                    "7、After boiling, simmer for about 5 minutes until the cabbage is about 8 minutes cooked.\n" +
                    "8、Add tofu and season with salt. Simmer for about 3 minutes.\n" +
                    "9、Add MSG to enhance freshness, then turn off the heat.\n" +
                    "10、Take it out of the pot and pour it into a bowl.",
            "Step：\n" +
                    "1、Put the chicken, green onion and ginger into the pot, add some salt, light soy sauce, and white wine\n" +
                    "2、Add curry powder\n" +
                    "3、After mixing well, use a fork to poke some small holes on the surface of the chicken\n" +
                    "4、Put on disposable gloves and massage evenly, marinate for more than three hours\n" +
                    "5、Put the ginger and shallots into the electric pressure cooker for the bottom\n" +
                    "6、Then put the marinated three yellow chicken on top\n" +
                    "7、Press the waterless bake function key on the pressure cooker\n" +
                    "8、When the time is up, this delicious \"curry chicken\" is ready." ,
            "Step：\n" +
                    "1、Prepare materials\n" +
                    "2、Put the vermicelli in a pot and cook until it becomes soft, remove it and cool it for later use.\n" +
                    "3、In the process of cooking vermicelli, remove the head of shrimp\n" +
                    "4、Open the back of the shrimp\n" +
                    "5、Mix vermicelli with a little light soy sauce and sesame oil\n" +
                    "6、Put the mixed vermicelli into the plate.\n" +
                    "7、Put the processed shrimp on the vermicelli.\n" +
                    "8、Mince garlic into fine pieces.\n" +
                    "9、Heat the right amount of oil in a pan, and pour in minced garlic.\n" +
                    "10、Fry minced garlic until fragrant, until it turns yellow.\n" +
                    "11、Put the fried minced garlic on top of the shrimp.\n" +
                    "12、Appropriate amount of soy sauce, vinegar, and cooking wine are mixed into a bowl of juice.\n" +
                    "13、Pour the adjusted bowl of juice over the shrimp.\n" +
                    "14、Heat the water in the pot, add the shrimp, and steam until the shrimp shell turns red and cooked through.\n" +
                    "15、Take a few green onion leaves and flatten them with a knife.\n" +
                    "16、Shred with a knife.\n" +
                    "17、Take the steamed shrimp out of the pan, garnish with shredded green onion and serve.",
            "Step：\n" +
                    "1、Cut chicken legs into small pieces.\n" +
                    "2、Put the cut chicken pieces into a bowl, add scallion ginger, maggi fresh and pepper and mix well\n" +
                    "3、Deseeded red pepper, washed and cut into pieces.\n" +
                    "4、Wash the green pepper and cut into small pieces.\n" +
                    "5、Heat oil in a pan, add onion and ginger\n" +
                    "6、Add marinated chicken pieces.\n" +
                    "7、Stir-fry until the chicken pieces come out of oil.\n" +
                    "8、Add white sugar and stir-fry to taste.\n" +
                    "9、Add green and red peppers and stir-fry until raw.\n" +
                    "10、Add tomato paste and stock.\n" +
                    "11、Stir fry for 10 seconds and turn off the heat.",
            "Step：\n" +
                    "1、Cut the pork into shreds, add cooking wine, and fry in a pan\n" +
                    "2、Bitter melon cleaned\n" +
                    "3、Dig out the center\n" +
                    "4、Cut into small pieces and soak in salt water\n" +
                    "5、Add oil to the pan\n" +
                    "6、Stir-fry with bitter gourd\n" +
                    "7、Add fried shredded pork\n" +
                    "8、Add salt and stir well\n" +
                    "9、Stir-fry until the vegetables are cooked, then add the chicken stock\n" +
                    "10、Fried and plated" ,
            "Step：\n" +
                    "1、Prepare materials\n" +
                    "2、Wash and peel the sweet potatoes for later use\n" +
                    "3、Sweet potatoes cut into hob pieces\n" +
                    "4、Add an appropriate amount of soybean oil to the pot\n" +
                    "5、When the oil is heated to 5 to 60% hot, add sweet potatoes and turn to medium heat.\n" +
                    "6、Deep-fry the sweet potatoes until the outside becomes hard, remove from the oil and set aside.\n" +
                    "7、Pour out the oil in the pot, and put an appropriate amount of white sugar in the pot.\n" +
                    "8、Turn to low heat until all the sugar in the pot has melted\n" +
                    "9、Continue to boil white sugar to make a thick juice like honey\n" +
                    "10、Cook for a while until the juice turns slightly red\n" +
                    "11、Pour in the fried sweet potato pieces and stir quickly, then take out of the pan and put on a plate.",
            "Step：\n" +
                    "1、Material: oil beans, pork belly\n" +
                    "2、Pick and wash the oil beans and remove them\n" +
                    "3、Cut into shreds on the chopping board and set aside\n" +
                    "4、Then, blanch the cut soybeans in boiling water until they are broken, and remove them.\n" +
                    "5、Pour the oil into the pan and heat it up, add the chopped pork belly and add a little cooking wine\n" +
                    "6、Stir fry stir fry\n" +
                    "7、Then, add the blanched oil beans and stir fry\n" +
                    "8、Then, add a little soy sauce\n" +
                    "9、Add a pinch of salt\n" +
                    "10、Take out of the pot and put on a plate",
            "Step：\n" +
                    "1、Take a small bowl and put some angel yeast\n" +
                    "2、Soak the angel yeast in warm water\n" +
                    "3、pour into white flour\n" +
                    "4、Pour warm water and stir with chopsticks\n" +
                    "5、Knead the dough by hand until the dough sticks together\n" +
                    "6、Cover with a wet cage cloth, cover the pot and wait for it to rise\n" +
                    "7、Soak the leeks in water for a while\n" +
                    "8、Take it out and put it on the cage to control the water\n" +
                    "9、Thaw and wash\n" +
                    "10、Minced meat\n" +
                    "11、Minced onion and ginger\n" +
                    "12、The cage cloth can be easily uncovered by patting it with cold water\n" +
                    "13、Wake up for a while with the lid on\n" +
                    "14、Chives cut into evenly sized pieces\n" +
                    "15、Put 1 raw egg, peanut oil, soy sauce, minced green onion and ginger in the meat stuffing\n" +
                    "16、Then put the chopped leeks into the meat stuffing\n" +
                    "19、Take a small piece of noodles\n" +
                    "20、After the bun skin is rolled out, add salt and monosodium glutamate and mix well\n" +
                    "21、put a spoonful of stuffing\n" +
                    "22、After wrapping, turn on the steamer and heat the water\n" +
                    "23、After the water in the pot boils, put the cage\n" +
                    "24、Steam over medium heat for 15 minutes"  ,
            "Step：\n" +
                    "1、Ingredients for making curry rice\n" +
                    "2、Cut onions, potatoes, and carrots into small cubes for later use\n" +
                    "3、Beef tenderloin is also cut into small cubes for later use\n" +
                    "4、Adjust to the appropriate temperature and stop for a while\n" +
                    "5、Add the beef and stir fry for a while\n" +
                    "6、Heat up the diced onions and sauté until fragrant\n" +
                    "7、Finally, add the diced potatoes and fry until crispy\n" +
                    "8、Add boiling water to the pot\n" +
                    "9、After the fire boils, change to a low heat and cook for a while\n" +
                    "10、Turn off the heat first, then add the curry to the pot until it melts\n" ,
            "Step：\n" +
                    "1、Clean the fish, add salt, cooking wine and ginger slices and marinate for a while\n" +
                    "2、Thinly slice the white radish (as thin as possible)\n" +
                    "3、Sliced onion, ginger and garlic, diced red pepper and chives\n" +
                    "4、Coat fish evenly with appropriate amount of dry flour\n" +
                    "5、Fry the fish until golden brown with appropriate amount of cooking oil\n" +
                    "6、In another frying pan, sauté shallot, ginger and garlic slices\n" +
                    "7、Add pomfret and radish slices, and add soy sauce at the same time\n" +
                    "8、Add cooking wine, shake the wok to distribute the seasoning evenly\n" +
                    "9、Add sugar and chicken stock, shake evenly\n" +
                    "10、Add boiling water and simmer until the fish is cooked\n" +
                    "11、Thicken the gorgon with appropriate amount of water starch\n" +
                    "12、Sprinkle with chives and red pepper",
            "Step：\n" +
                    "1、400g fresh pork ribs\n" +
                    "2、Ready seasoning\n" +
                    "3、Blanch the pork ribs in boiling water to remove the sewage\n" +
                    "4、Wash and drain\n" +
                    "5、Use 3 pieces of fermented bean curd, a little cooking wine, a little starch\n" +
                    "6、Mix the pork ribs with the adjusted juice evenly and marinate for 2 hours\n" +
                    "7、Wash and slice fresh shiitake mushrooms\n" +
                    "8、Put the marinated ribs on top of the mushrooms\n" +
                    "9、Cut a little ginger, minced garlic and a little chili powder and sprinkle on the ribs\n" +
                    "10、After the water in the pot boils, put it in\n" ,
            "Step：\n" +
                    "1、The making process is divided into two parts, the filling and the dumpling skin\n" +
                    "2、Wash the corn and drain\n" +
                    "3、Wash the green onions, cut into chopped green onions and set aside\n" +
                    "4、Peel the pork belly and chop into meat fillings, add all the seasonings and stir vigorously\n" +
                    "5、Stir well to combine\n" +
                    "6、The stuffing is ready, let's start making dumpling wrappers\n" +
                    "7、Slowly add the water to the flour and stir until flaky\n" +
                    "8、Knead the dough by hand until smooth\n" +
                    "9、Roll out the dough into thin slices\n" +
                    "10、Use a split mold to press on the rolled out dough\n" +
                    "11、Sprinkle some dry flour on both sides to prevent sticking\n" +
                    "12、Take a piece of round dough and put the stuffing inside\n" +
                    "13、Wrapped dumplings\n" +
                    "14、Boil the dumplings, put the dumplings after the water boils\n" ,
            "Step：\n" +
                    "1、Eggplant cut into hob cubes.\n" +
                    "2、Chopped eggplant\n" +
                    "3、Marinate the cut eggplant with a little salt for 15-20 minutes\n" +
                    "4、Cut the potatoes into hob cubes as well\n" +
                    "5、The cut potatoes must stick to the pan\n" +
                    "6、Cut the bell pepper into chunks\n" +
                    "7、Put oil in the pot\n" +
                    "8、Heat the oil, add the potatoes when the oil is hot\n" +
                    "9、A spoonful of light soy sauce, a little oil consumption, an appropriate amount of water\n" +
                    "10、After the potatoes are fried, take them out and fry them in hot oil.\n" +
                    "11、Drain the eggplants and set aside\n" +
                    "12、Add potatoes and eggplant and stir fry.\n" +
                    "13、Pour in the seasoning sauce, stir-fry for 3 minutes to thicken the sauce."
    };
    private static final int[] resId = {
            R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,
            R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10,
            R.drawable.img11,R.drawable.img12,R.drawable.img13,R.drawable.img14,R.drawable.img15
    };
    private static final String[] foodjianjie = {
            "Main: Arrowhead 300 grams, tenderloin 150 grams\n" +
                    "Accessories: 50 grams of garlic sprouts, appropriate amount of onion, appropriate amount of salt",
            "Main: 800 grams herring, 400 grams sauerkraut, 1 egg white\n" +
                    "Accessories: appropriate amount of cumin, appropriate amount of dried pepper, appropriate amount of prickly ash",
            "Main: Appropriate amount of cabbage, appropriate amount of tofu\n" +
                    "Accessories: appropriate amount of chopped green onion, appropriate amount of cooking oil",
            "Main: 1 chicken\n" +
                    "Accessories: appropriate amount of ginger, appropriate amount of green onion, appropriate amount of garlic",
            "Main: 10 prawns, appropriate amount of vermicelli\n" +
                    "Accessories: appropriate amount of onion, appropriate amount of ginger, appropriate amount of garlic",
            "Main: 400g chicken leg, 50ml broth\n" +
                    "Accessories: 80 grams of green peppers, 80 grams of red peppers, 15 grams of green onions",
            "Main: 1 sweet potato\n" +
                    "Accessories: appropriate amount of sugar, appropriate amount of soybean oil",
            "Main: 75 grams of pork belly\n" +
                    "Accessories: 150g oil beans, a little cooking wine",
            "Main: half a catty of pork, 1 appropriate amount of leek, 1 raw egg\n" +
                    "Accessories: 4 bowls of white flour, appropriate amount of chopped green onion, appropriate amount of ginger",
            "Main: Appropriate amount of carrot, appropriate amount of beef tenderloin\n" +
                    "Accessories: appropriate amount of onion, appropriate amount of curry, appropriate amount of potato",
            "Main: 1 fish\n" +
                    "Accessories: appropriate amount of garlic, appropriate amount of ginger",
            "Main: 400 grams of pork ribs, 200 grams of fresh mushrooms\n" +
                    "Accessories: appropriate amount of salt, appropriate amount of fermented bean curd",
            "Main: 500 grams of pork belly, 350 grams of corn\n" +
                    "Accessories: 200 grams of flour, 4 green onions, appropriate amount of water",
            "Main: 1 eggplant, 2 green peppers\n" +
                    "Accessories: 1 potato, 3 cloves of garlic",
            "Main: 360 grams of pork hind leg\n" +
                    "Accessories: 3 tablespoons light soy sauce, 2 tablespoons coarse sugar",
            "Main: 125 grams of donkey-hide gelatin, 250 grams of walnut kernels\n" +
                    "Accessories: 250g black sesame (fried)"
    };

    public static List<FoodBean> getAllFoodList(){
        List<FoodBean> list = new ArrayList<>();

        for (int i = 0; i <food.length ; i++) {
            FoodBean bean = new FoodBean(food[i],food1[i],foodjianjie[i],resId[i]);
            list.add(bean);
        }
        return list;
    }
}
