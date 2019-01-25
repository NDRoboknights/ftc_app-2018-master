package org.firstinspires.ftc.teamcode.Enums;

public enum Color
{
    BLUE(1), RED(-1), UNKNOWN(0), GOLD(2), WHITE(-2);

    public int v;

    Color(int v){this.v = v;}
}