# Get-inner-or-nested-class-names-in-dot-notation

Java speichert innere und geschachtelte Klassen mit einem Dollar-Zeichen als Trenner im Dateisystem.

Java stores inner and nested classes with a dollar sign as a separator in the file system.

Leider gibt die Methode getName der Klasse 'Class' den  Namen der Klasse auch mit einem Dollar-Zeichen als Trenner zurück und nicht so, wie der Name im Java Quelltext hingeschrieben wird, mit Punkten getrennt, zurück.

Unfortunately, the getName method of the 'Class' class also returns the name of the class with a dollar sign as a separator and not as the name is written in the Java source code, separated by dots.

Diese kleines Java-Klasse gibt den Namen von inneren und geschachtelten Klassen per Reflektion in der erwarteten Punkt-Schreibweise zurück.

This little Java class returns the names of inner and nested classes by reflection in the expected dot notation.

Der Paketname wird dem Klassennamen vorangestellt.

The package name is prepended to the class name.

Innere Klassen haben ein unsichtbares Feld mit einer Referenz zu dem äusseren Objekt.

Inner classes have an invisible field with a reference to the outer object.

Innere Klassen werden ohne den static Modifizierer in den Körper der äusseren Klasse geschrieben.

Inner classes are written in the body of the outer class without the static modifier.

Geschachtelte Klassen werden mit dem static Modifizierer in den Körper der einschachtelden Klasse geschrieben und existieren nur in dem Namensraum der einschachtelden Klasse, haben aber sonst nichts mit der einschachtelden Klasse zu tun.

Nested classes are written into the body of the nested class with the static modifier and only exist in the namespace of the nested class, but have nothing to do with the nested class.
