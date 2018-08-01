package com.team1625.frc2017;

import edu.wpi.first.wpilibj.Joystick;

/**
 * Contains the button mappings for the competition control board. Like the drive code, one instance of the ControlBoard
 * object is created upon startup, then other methods request the singleton ControlBoard instance. Implements the
 * ControlBoardInterface.
 * 
 * @see ControlBoardInterface.java
 */
public class ControlBoard implements ControlBoardInterface {
    private static ControlBoardInterface mInstance = null;

    private static final boolean kUseGamepad = false;

    public static ControlBoardInterface getInstance() {
        if (mInstance == null) {
            if (kUseGamepad) {
                mInstance = new GamepadControlBoard();
            } else {
                mInstance = new ControlBoard();
            }
        }
        return mInstance;
    }


    }
}
