package com.example.relativelayout

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class TicTacToeFragment : Fragment(),View.OnClickListener {

    var flag = 0
    var count = 0

    lateinit var res : TextView

    lateinit var btn00 : Button
    lateinit var btn01 : Button
    lateinit var btn02 : Button
    lateinit var btn10 : Button
    lateinit var btn11 : Button
    lateinit  var btn12 : Button
    lateinit var btn20 : Button
    lateinit  var btn21 : Button
    lateinit var btn22 : Button

    lateinit var clear : Button

    lateinit var b00 : String
    lateinit  var b01 : String
    lateinit  var b02 : String
    lateinit  var b10 : String
    lateinit var b11 : String
    lateinit var b12 : String
    lateinit  var b20 : String
    lateinit var b21 : String
    lateinit var b22 : String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tic_tac_toe, container, false)
    }

    override fun onViewCreated (view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn00 = view.findViewById(R.id.btn00)
        btn01 = view.findViewById(R.id.btn01)
        btn02 = view.findViewById(R.id.btn02)
        btn10 = view.findViewById(R.id.btn10)
        btn11 = view.findViewById(R.id.btn11)
        btn12 = view.findViewById(R.id.btn12)
        btn20 = view.findViewById(R.id.btn20)
        btn21 = view.findViewById(R.id.btn21)
        btn22 = view.findViewById(R.id.btn22)

        clear=view.findViewById(R.id.clear)

        res = view.findViewById(R.id.res)

        clear.setOnClickListener()
        {
            New();
        }

        btn00.setOnClickListener(this)
        btn01.setOnClickListener(this)
        btn02.setOnClickListener(this)
        btn10.setOnClickListener(this)
        btn11.setOnClickListener(this)
        btn12.setOnClickListener(this)
        btn20.setOnClickListener(this)
        btn21.setOnClickListener(this)
        btn22.setOnClickListener(this)

    }

    fun check(view: Button)
    {
        view.isClickable=false
    }

    fun New()
    {
        flag=0
        count=0

        btn00.text=""
        btn01.text=""
        btn02.text=""
        btn10.text=""
        btn11.text=""
        btn12.text=""
        btn20.text=""
        btn21.text=""
        btn22.text=""

        btn00.isClickable=true
        btn01.isClickable=true
        btn02.isClickable=true
        btn10.isClickable=true
        btn11.isClickable=true
        btn12.isClickable=true
        btn20.isClickable=true
        btn21.isClickable=true
        btn22.isClickable=true
    }

    fun click(view: View)  {
        count++
        var btnCurrent : View
        btnCurrent = view as Button

        if (flag==0)
        {
            btnCurrent.text ="X"
            flag = 1
        }
        else
        {
            btnCurrent.text ="O"
            flag=0
        }

        if (count>4&&count<10)
        {
            b00=btn00.text.toString()
            b01=btn01.text.toString()
            b02=btn02.text.toString()
            b10=btn10.text.toString()
            b11=btn11.text.toString()
            b12=btn12.text.toString()
            b20=btn20.text.toString()
            b21=btn21.text.toString()
            b22=btn22.text.toString()

            if (b00==b01 && b01==b02 && b00 != "")
            {
                var tmp : String
                tmp = btn00.text.toString()
                if (tmp.equals("X"))
                {
                    res.text ="Player 1 Wins !"
                    btn00.isClickable=false
                    btn01.isClickable=false
                    btn02.isClickable=false
                    btn10.isClickable=false
                    btn11.isClickable=false
                    btn12.isClickable=false
                    btn20.isClickable=false
                    btn21.isClickable=false
                    btn22.isClickable=false
                }
                else
                {
                    res.text ="Player 2 Wins !"
                    btn00.isClickable=false
                    btn01.isClickable=false
                    btn02.isClickable=false
                    btn10.isClickable=false
                    btn11.isClickable=false
                    btn12.isClickable=false
                    btn20.isClickable=false
                    btn21.isClickable=false
                    btn22.isClickable=false
                }
            }
            else if (b00==b10 && b10==b20 && b00 != "")
            {
                var tmp : String
                tmp = btn00.text.toString()
                if (tmp.equals("X"))
                {
                    res.text="Player 1 Wins !"
                    btn00.isClickable=false
                    btn01.isClickable=false
                    btn02.isClickable=false
                    btn10.isClickable=false
                    btn11.isClickable=false
                    btn12.isClickable=false
                    btn20.isClickable=false
                    btn21.isClickable=false
                    btn22.isClickable=false
                }
                else
                {
                    res.text ="Player 2 Wins !"
                    btn00.isClickable=false
                    btn01.isClickable=false
                    btn02.isClickable=false
                    btn10.isClickable=false
                    btn11.isClickable=false
                    btn12.isClickable=false
                    btn20.isClickable=false
                    btn21.isClickable=false
                    btn22.isClickable=false
                }
            }

            else if (b00==b11 && b11==b22 && b00 != "")
            {
                var tmp : String
                tmp = btn00.text.toString()
                if (tmp.equals("X"))
                {
                    res.text ="Player 1 Wins !"
                    btn00.isClickable=false
                    btn01.isClickable=false
                    btn02.isClickable=false
                    btn10.isClickable=false
                    btn11.isClickable=false
                    btn12.isClickable=false
                    btn20.isClickable=false
                    btn21.isClickable=false
                    btn22.isClickable=false
                }
                else
                {
                    res.text ="Player 2 Wins !"
                    btn00.isClickable=false
                    btn01.isClickable=false
                    btn02.isClickable=false
                    btn10.isClickable=false
                    btn11.isClickable=false
                    btn12.isClickable=false
                    btn20.isClickable=false
                    btn21.isClickable=false
                    btn22.isClickable=false
                }
            }

            else if (b01==b11 && b11==b21 && b01 != "")
            {
                var tmp : String
                tmp = btn01.text.toString()
                if (tmp.equals("X"))
                {
                    res.text ="Player 1 Wins !"
                    btn00.isClickable=false
                    btn01.isClickable=false
                    btn02.isClickable=false
                    btn10.isClickable=false
                    btn11.isClickable=false
                    btn12.isClickable=false
                    btn20.isClickable=false
                    btn21.isClickable=false
                    btn22.isClickable=false
                }
                else
                {
                    res.text ="Player 2 Wins !"
                    btn00.isClickable=false
                    btn01.isClickable=false
                    btn02.isClickable=false
                    btn10.isClickable=false
                    btn11.isClickable=false
                    btn12.isClickable=false
                    btn20.isClickable=false
                    btn21.isClickable=false
                    btn22.isClickable=false
                }
            }

            else if (b02==b12 && b12==b22 && b02 != "")
            {
                var tmp : String
                tmp = btn02.text.toString()
                if (tmp.equals("X"))
                {
                    res.text ="Player 1 Wins !"
                    btn00.isClickable=false
                    btn01.isClickable=false
                    btn02.isClickable=false
                    btn10.isClickable=false
                    btn11.isClickable=false
                    btn12.isClickable=false
                    btn20.isClickable=false
                    btn21.isClickable=false
                    btn22.isClickable=false
                }
                else
                {
                    res.text ="Player 2 Wins !"
                    btn00.isClickable=false
                    btn01.isClickable=false
                    btn02.isClickable=false
                    btn10.isClickable=false
                    btn11.isClickable=false
                    btn12.isClickable=false
                    btn20.isClickable=false
                    btn21.isClickable=false
                    btn22.isClickable=false
                }
            }

            else if (b02==b11 && b11==b20 && b02 != "")
            {
                var tmp : String
                tmp = btn02.text.toString()
                if (tmp.equals("X"))
                {
                    res.text ="Player 1 Wins !"
                    btn00.isClickable=false
                    btn01.isClickable=false
                    btn02.isClickable=false
                    btn10.isClickable=false
                    btn11.isClickable=false
                    btn12.isClickable=false
                    btn20.isClickable=false
                    btn21.isClickable=false
                    btn22.isClickable=false
                }
                else
                {
                    res.text ="Player 2 Wins !"
                    btn00.isClickable=false
                    btn01.isClickable=false
                    btn02.isClickable=false
                    btn10.isClickable=false
                    btn11.isClickable=false
                    btn12.isClickable=false
                    btn20.isClickable=false
                    btn21.isClickable=false
                    btn22.isClickable=false
                }
            }

            else if (b10==b11 && b11==b12 && b10 != "")
            {
                var tmp : String
                tmp = btn10.text.toString()
                if (tmp.equals("X"))
                {
                    res.text ="Player 1 Wins !"
                    btn00.isClickable=false
                    btn01.isClickable=false
                    btn02.isClickable=false
                    btn10.isClickable=false
                    btn11.isClickable=false
                    btn12.isClickable=false
                    btn20.isClickable=false
                    btn21.isClickable=false
                    btn22.isClickable=false
                }
                else
                {
                    res.text ="Player 2 Wins !"
                    btn00.isClickable=false
                    btn01.isClickable=false
                    btn02.isClickable=false
                    btn10.isClickable=false
                    btn11.isClickable=false
                    btn12.isClickable=false
                    btn20.isClickable=false
                    btn21.isClickable=false
                    btn22.isClickable=false
                }
            }

            else if (b20==b21 && b21==b22 && b20 != "")
            {
                var tmp : String
                tmp = btn20.text.toString()
                if (tmp.equals("X"))
                {
                    res.text ="Player 1 Wins !"
                    btn00.isClickable=false
                    btn01.isClickable=false
                    btn02.isClickable=false
                    btn10.isClickable=false
                    btn11.isClickable=false
                    btn12.isClickable=false
                    btn20.isClickable=false
                    btn21.isClickable=false
                    btn22.isClickable=false
                }
                else
                {
                    res.text ="Player 2 Wins !"
                    btn00.isClickable=false
                    btn01.isClickable=false
                    btn02.isClickable=false
                    btn10.isClickable=false
                    btn11.isClickable=false
                    btn12.isClickable=false
                    btn20.isClickable=false
                    btn21.isClickable=false
                    btn22.isClickable=false
                }
            }

            else
            {
                res.text="Draw"
            }
        }
        check(btnCurrent)
    }


    override fun onClick(p0: View?) {
        if (p0?.id == R.id.btn00 || p0?.id == R.id.btn01 || p0?.id == R.id.btn02 || p0?.id == R.id.btn10 || p0?.id == R.id.btn11 || p0?.id == R.id.btn12  ||  p0?.id == R.id.btn20 || p0?.id == R.id.btn21 || p0?.id == R.id.btn22)
        {
            click(p0)
        }
    }

}