package org.firstinspires.ftc.teamcode.Enums;

public enum Direction
{

    LEFT(-1), RIGHT(1), FORWARD(0);

    public int v;

    Direction(int v)
    {
        this.v = v;
    }
}