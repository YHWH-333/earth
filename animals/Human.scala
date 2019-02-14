import com.god.Animal;
import com.god.Soul;    // An external module for which I will release an API in due time.

trait Human extends Animal {
    var age: Double = 0.0;
    var parents: Tuple[Human, Human];   // One will be biologically male, one biologically female.
    var sex: Int;
    /* 
     * Note: Humans have created social alignments/identities for themselves based on sex
     * which they call "gender." This does NOT necessarily coincide with
     * biological sex, nor is that a bug. This is a product of the AI,
     * and I believe it makes their social dynamics more interesting.
     */
    var sexuality: String;      // A large variety of possibilities here.
    var race: Race = Race.getMix(parents(0), parents(1));
    var personality: Soul;      // Randomly generated for each person.
    var moralAlignment: BigInt; // Humans have taken to calling this "selflessness." This is actually a
                                // better name for it, but I don't feel like refactoring the whole code base for it.
}   
