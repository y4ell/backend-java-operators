# Backend Java: Operators

## Inleiding

Deze repository bevat oefeningen voor het werken met operators in Java.
Neem eerst het hoofdstuk over operators door.

Je gaat oefenen met het muteren van waarden door mideel van operators.

Je ziet in src/main/java een class `Main`.

In deze class staan een hoop declaraties en toewijzingen.

Welke operators kunnen we gebruiken om alles te laten kloppen?

## Voor je begint

Voorwaarden voor deze opdracht:
1. Java Development Kit, versie 17
2. IntelliJ IDEA

### Uitvoeren met Maven

Voer de opdracht code uit met:

```shell
./mvnw clean compile exec:java
```

of 

```shell
mvnw.cmd clean compile exec:java
```

### Uitvoeren vanuit Intellij

Groene play-knop voor de `main` method klikken en 'Run...' kiezen. 

### Testen uitvoeren vanuit Intellij

Groene play-knop voor de `MainTest` class in src/test/java klikken en 'Run 'MainTest'' kiezen.

## Opdracht

Doorloop de code van boven naar beneden. Je komt comments tegen die beschrijven wat je op de regel daaronder mag wijzigen.

### Randvoorwaarden

Wijzig geen andere regels. Je mag alleen de regels aanpassen waar door middel van een comment om de oplossing wordt gevraagd.

### Stappenplan

_Let op_ het is uitdagender om jouw eigen stappenplan te maken. Als je niet zo goed weet waar je moet beginnen, kun je onderstaand stappenplan gebruiken

* Het eerste deel van deze opdracht gaat over wiskundige operatoren. De eerste vraag is om het statement `int four = x` op te lossen.
* Schrijf de vraag eerst een op als wiskunde som.
  * 4 = x
* Bedenk nu wat je al weet. De eerste regel van deze code is `x = 3`
  * 4 = 3
* Dit klopt niet, welke wiskundige operatie kunnen we toewijzen om dit kloppend te maken? We kunnen er 1 bij optellen.
  * 4 = 3 + 1
* Vertaal dit nu terug naar de code.
  * int four = x + 1;

De wiskundige operaties zijn relatief simpel, wat belangrijk is bij het programmeren is ook rekening te houden met de typering van de variabele.
De eerste opdracht is wiskundig ook op te lossen door te vermenigvuldigen met 1 1/3de. 1 1/3de is echter geen Integer, maar een fraction. Fractions reageren in java anders dan in de wiskunde. Een wiskundige operatie met twee int's resulteerd altijd in een int. 1 / 3 is daardoor 0. Java gooit alles achter de komma weg. Zelfs 9 / 10 is dus 0. 

Als we van 1 van de 2 operands een float of een double maken krijgen we wel netjes een komma getal (1 / 3f = 0.33333334), maar dit is geen int. Aangezien je op zoek bent naar int four moeten beide operands dus van het type int zijn.

Houd bij de volgende opgaves rekening met de types!

