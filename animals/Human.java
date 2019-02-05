import com.god.Animal;
import com.god.Soul;

trait Human extends Animal {
    var age: Double = 0.0;
    var parents: Tuple[Human, Human];   // One will be biologically male, one biologically female.
    var sex: Int;
    /* Note: Humans have created social alignments for themselves based on sex
     * which they call "gender." This does NOT necessarily coincide with
     * biological sex, and this is completely okay.
     */
    var sexuality: String;  // A large variety of possibilities here.
    var race: Race;         // Dependent on parents.
    var personality: Soul;  // Randomly generated for each person.
}   
