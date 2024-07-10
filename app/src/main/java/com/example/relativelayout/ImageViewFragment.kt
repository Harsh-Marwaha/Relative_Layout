package com.example.relativelayout

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView


class ImageViewFragment : Fragment() {

    lateinit var img1 : ImageView
    lateinit var img2 : ImageView
    lateinit var img3 : ImageView
    lateinit var img4 : ImageView
    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button
    lateinit var btn4 : Button
    lateinit var btnImg : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        img1 = view.findViewById(R.id.imgOne)
        img2 = view.findViewById(R.id.imgTwo)
        img3=view.findViewById(R.id.imgThree)
        img4=view.findViewById(R.id.imgFour)
        btn1=view.findViewById(R.id.btn1)
        btn2=view.findViewById(R.id.btn2)
        btn3=view.findViewById(R.id.btn3)
        btn4=view.findViewById(R.id.btn4)

        var count = 0
        btn1.setOnClickListener ()
        {
            if (count==0)
            {
                img1.setImageResource(R.drawable.instagram)
                count++
            }
            else if (count==1)
            {
                count++
                img1.setImageResource(R.drawable.facebook)
            }

            else if (count==2)
            {
                count++
                img1.setImageResource(R.drawable.twitter)
            }

            else if (count==3)
            {
                img1.setImageResource(R.drawable.whatsapp)
                count=0
            }
        }


        btn2.setOnClickListener ()
        {
            if (count==0)
            {
                img2.setImageResource(R.drawable.instagram)
                count++
            }
            else if (count==1)
            {
                count++
                img2.setImageResource(R.drawable.facebook)
            }

            else if (count==2)
            {
                count++
                img2.setImageResource(R.drawable.twitter)
            }

            else if (count==3)
            {
                img2.setImageResource(R.drawable.whatsapp)
                count=0
            }
        }

        btn3.setOnClickListener ()
        {
            if (count==0)
            {
                img3.setImageResource(R.drawable.facebook)
                count++
            }
            else if (count==1)
            {
                count++
                img3.setImageResource(R.drawable.twitter)
            }

            else if (count==2)
            {
                count++
                img3.setImageResource(R.drawable.instagram)
            }

            else if (count==3)
            {
                img3.setImageResource(R.drawable.whatsapp)
                count=0
            }
        }

        btn4.setOnClickListener ()
        {
            if (count==0)
            {
                img4.setImageResource(R.drawable.whatsapp)
                count++
            }
            else if (count==1)
            {
                count++
                img4.setImageResource(R.drawable.instagram)
            }

            else if (count==2)
            {
                count++
                img4.setImageResource(R.drawable.facebook)
            }

            else if (count==3)
            {
                img4.setImageResource(R.drawable.twitter)
                count=0
            }

        }
    }

}