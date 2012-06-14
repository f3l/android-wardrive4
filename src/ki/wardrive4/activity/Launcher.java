/*
 *   wardrive4 - android wardriving application (remake for the ICS)
 *   Copyright (C) 2012 Raffaele Ragni
 *   https://github.com/raffaeleragni/android-wardrive4
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *   
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ki.wardrive4;

import android.app.Activity;
import android.os.Bundle;

/**
 * Launcher entry point.
 * 
 * Since activities mapped as LAUNCHER will be used for shortcuts, this one has
 * been created to maintain a common static entry point for the application to
 * be launched.
 * 
 * Also, global application initialization code goes here.
 * Example: checks for WiFi to be enabled.
 * 
 * @author Raffaele Ragni <raffaele.ragni@gmail.com>
 */
public class Launcher extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }
}
