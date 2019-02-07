// Basic layout for Jehovah-3's central planet, Earth.

import com.god.Planet;
import com.god.Physics;

object PlanetEarth extends Planet {
    /* Using Human units (kg) for readability.
     * Previous versions used units such as cubits and stones, but humans
     * have become accustomed to a base-10 system. This open-source release will
     * accomodate this; humans DO have good ideas sometimes...except the
     * Americans, for some reason.
     */
    var mass: Double = 5.97219e24       // kg
    var shape: String = "Pear";         // No, you fools, it's not flat.
    var tilt: Double = 23.5;            // degrees (°)
    var rotVelocity: Double = 460       // m/s
    var sustainsLife: Boolean = true;   // Otherwise what's the point?
}
