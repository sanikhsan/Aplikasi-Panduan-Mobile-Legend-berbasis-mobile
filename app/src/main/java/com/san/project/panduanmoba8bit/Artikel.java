package com.san.project.panduanmoba8bit;

import java.util.ArrayList;

public class Artikel {
    private static String[] judulartikel = {
            "Jungle Crab",
            "Jungle Crammer",
            "Jungle Fiend",
            "Jungle Lithowanderer",
            "Jungle Scaled Lizard",
            "Jungle Serpent",
            "Hero Tipe Assasin",
            "Hero Tipe Fighter",
            "Hero Tipe Jungle",
            "Hero Tipe Mage",
            "Hero Tipe Marksman",
            "Hero Tipe Support"
    };

    private static String[] deskripsi =  {
            "a",
            "b",
            "c",
            "d",
            "e",
            "f",
            "g",
            "h",
            "i",
            "j",
            "k",
            "l"
    };

    private static String[] tag = {
            "Monster Hutam",
            "Monster Hutam",
            "Monster Hutam",
            "Monster Hutam",
            "Monster Hutam",
            "Monster Hutam",
            "Role Hero",
            "Role Hero",
            "Role Hero",
            "Role Hero",
            "Role Hero",
            "Role Hero"
    };

    private static int[] photo = {
            R.drawable.crab1,
            R.drawable.crammer2,
            R.drawable.fiend3,
            R.drawable.lithowanderer4,
            R.drawable.scaledizard5,
            R.drawable.serpent6,
            R.drawable.assasin7,
            R.drawable.fighter8,
            R.drawable.jungle9,
            R.drawable.mage10,
            R.drawable.marksman11,
            R.drawable.support12
    };

    static ArrayList<Postingan> getListData(){
        ArrayList<Postingan> list = new ArrayList<>();
        for (int position = 0; position < judulartikel.length; position++) {
            Postingan postingan = new Postingan();
            postingan.setJudul(judulartikel[position]);
            postingan.setTag(tag[position]);
            postingan.setDeskripsi(deskripsi[position]);
            postingan.setPhoto(photo[position]);
            list.add(postingan);
        }
        return list;
    }
}
