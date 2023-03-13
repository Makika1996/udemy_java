package nested;

import nested.StaticNestedTypes.NonNull;

/**
 * Lernziel: Motivation für geschachtelte Typen
 * - Top-Level Typen vs. geschachtelte Typen
 * - Arten von geschachtelte Typen
 */

public class NestedTypes {
    enum Color {
        RED
    }

    public static void main(String[] args) {

        NonNull nonNull;
        /*
        Statischer geschachtelter Typ
        _____________________________

        class Out {
            static class In {}
        }
         */
        /*
        Innere Mitgliedsklasse
        ______________________

        class Out {
            class In {}
        }
         */
        /*
        Lokaler (innerer) Typ
        _____________________

        class Out {
            Out() {
                class In { }
            }
        }
         */
        /*
        Anonyme innere Klasse
        _____________________

        class Out {
            Out() {
                Runnable r = new Runnable() {
                    public void run() { }
                }
            }
        }
         */
    }
}