// Jehovah3: The universe and laws by which Earth's objects must abide.

import com.god.Universe;    // Instance of Universe trait.
import com.god.Thing;       // Any physical object.

object Jehovah3 extends Universe {

    val gravConst: Double = 6.67408e-11;    // (N * m²)/(kg²)
    val lightSpeed: Double = 299792458;     // m/s

    /**
     * Get gravitational force between two things.
     * @param obj1 First object
     * @param obj2 Second object
     * @return The gravitational force (Newtons) between two objects.
     */
    def getGravity(obj1: Thing, obj2: Thing): Double {
        // Get how objects are related w.r.t. space.
        var related = obj1.getMass() * obj2.getMass() / obj1.distanceFrom(obj2);
        // Use that relation to calculate force between them.
        return gravConst * related;
    }

    // TODO: Release code for other laws. Still removing personal comments.
}
