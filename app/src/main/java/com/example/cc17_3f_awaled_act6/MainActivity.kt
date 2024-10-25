package com.example.cc17_3f_awaled_act6

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cc17_3f_awaled_act6.Adapter.Adapter
import com.example.cc17_3f_awaled_act6.model.AboutMeItem


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvAboutMe: RecyclerView = findViewById(R.id.rvAboutMe)
        rvAboutMe.layoutManager = LinearLayoutManager(this)


        val day1 = AboutMeItem(
            R.drawable.i1,
            "Practice drawing Lines and Shapes",
            "To avoid being bored try making optical illusion using lines and shapes.",
            "Day 1"
        )

        val day2 = AboutMeItem(
            R.drawable.i2,
            "Shading Basics",
            "Experiment with shading techniques like hatching, cross-hatching, and blending.",
            "Day 2"
        )

        val day3 = AboutMeItem(
            R.drawable.i3,
            "Simple Forms",
            "Draw basic 3D shapes like cubes, spheres, and cylinders to understand form.",
            "Day 3"
        )

        val day4 = AboutMeItem(
            R.drawable.i4,
            "Still Life",
            "Sketch a simple object from life, such as a cup or apple, focusing on proportions.",
            "Day 4"
        )

        val day5 = AboutMeItem(
            R.drawable.i5,
            "Perspective",
            "Draw a room corner or a set of cubes in one-point perspective.",
            "Day 5"
        )

        val day6 = AboutMeItem(
            R.drawable.i6,
            "Gesture Drawing",
            "Create quick sketches (1-2 min.) of people or animals in different poses.",
            "Day 6"
        )

        val day7 = AboutMeItem(
            R.drawable.i7,
            "Contour Lines",
            "Draw objects using only outline contours to focus on shapes.",
            "Day 7"
        )

        val day8 = AboutMeItem(
            R.drawable.i8,
            "Light & Shadow",
            "Draw a sphere with light and shadow, understanding the light source.",
            "Day 8"
        )

        val day9 = AboutMeItem(
            R.drawable.i9,
            "Negative Space",
            "Choose an object and draw only the space around it.",
            "Day 9"
        )

        val day10 = AboutMeItem(
            R.drawable.i10,
            "Cross-Contour Lines",
            "Use cross-contour lines to give flat shapes more dimension.",
            "Day 10"
        )

        val day11 = AboutMeItem(
            R.drawable.i11,
            "Texture Practice",
            "Draw different textures like fur, fabric, wood, or metal.",
            "Day 11"
        )

        val day12 = AboutMeItem(
            R.drawable.i12,
            "Hands & Feet",
            "Practice drawing hands and feet in various positions.",
            "Day 12"
        )

        val day13 = AboutMeItem(
            R.drawable.i13,
            "Eyes & Expressions",
            "Draw different eye shapes and expressions.",
            "Day 13"
        )

        val day14 = AboutMeItem(
            R.drawable.i14,
            "Animals",
            "Draw a basic animal form (dog, cat, or bird) focusing on simple shapes.",
            "Day 14"
        )

        val day15 = AboutMeItem(
            R.drawable.i15,
            "Plants & Flowers",
            "Sketch plants or flowers, focusing on organic shapes and lines.",
            "Day 15"
        )

        val day16 = AboutMeItem(
            R.drawable.i16,
            "Hair & Fur",
            "Practice creating realistic hair or fur textures.",
            "Day 16"
        )

        val day17 = AboutMeItem(
            R.drawable.i17,
            "Everyday Objects",
            "Draw something from around your home, focusing on realistic detail.",
            "Day 17"
        )

        val day18 = AboutMeItem(
            R.drawable.i18,
            "Stylized Portrait",
            "Create a stylized self-portrait or character.",
            "Day 18"
        )

        val day19 = AboutMeItem(
            R.drawable.i19,
            "Quick Figure Drawing",
            "Do 1-5 minute sketches of people in action poses.",
            "Day 19"
        )

        val day20 = AboutMeItem(
            R.drawable.i20,
            "Nature Study",
            "Sketch something from nature, like a leaf or shell, paying attention to detail.",
            "Day 20"
        )

        val day21 = AboutMeItem(
            R.drawable.i21,
            "Fantasy Creature",
            "Design an imaginary creature, combining features from different animals.",
            "Day 21"
        )

        val day22 = AboutMeItem(
            R.drawable.i22,
            "Cartoon Character",
            "Create a cartoon version of yourself or a friend.",
            "Day 22"
        )

        val day23 = AboutMeItem(
            R.drawable.i23,
            "Food Illustration",
            "Draw a favorite food with attention to shape, color, and texture.",
            "Day 23"
        )

        val day24 = AboutMeItem(
            R.drawable.i24,
            "Environment Sketch",
            "Draw a simple landscape or room to practice perspective and setting.",
            "Day 24"
        )

        val day25 = AboutMeItem(
            R.drawable.i25,
            "Abstract Art",
            "Create an abstract piece, experimenting with shapes, lines, and colors.",
            "Day 25"
        )

        val day26 = AboutMeItem(
            R.drawable.i26,
            "Dream Scene",
            "Draw a scene inspired by a dream or an imaginary place.",
            "Day 26"
        )

        val day27 = AboutMeItem(
            R.drawable.i27,
            "Comic Panel",
            "Create a one-panel comic, focusing on storytelling through images.",
            "Day 27"
        )

        val day28 = AboutMeItem(
            R.drawable.i28,
            "Album Cover",
            "Design an album cover for a favorite artist or fictional band.",
            "Day 28"
        )

        val day29 = AboutMeItem(
            R.drawable.i29,
            "Mix Media",
            "Use additional materials (like ink, markers, or collage) to enhance a drawing.",
            "Day 29"
        )

        val day30 = AboutMeItem(
            R.drawable.i30,
            "Final Piece",
            "Combine everything learned to create a final piece, like a portrait, scene, or illustration.",
            "Day 30"
        )



        val arrList = listOf(day1, day2, day3, day4, day5, day6, day7, day8, day9, day10, day11, day12, day13, day14, day15, day16, day17, day18, day19, day20, day21, day22, day23, day24, day25, day26, day27, day28, day29, day30)



        rvAboutMe.adapter = Adapter(arrList)
    }
}