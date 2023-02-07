# Opdrachtbeschrijving - Operators

## Inleiding

Je gaat operators gebruiken om waardes te muteren! Je zult waardes gaan optellen, aftrekken, door elkaar delen en met elkaar vergelijken. In de `Main`-class zul je een hoop declaraties en toewijzingen vinden. Welke operators kunnen we gebruiken om alles te laten kloppen?

Je kunt deze opdracht maken door het project te clonen of te downloaden naar jouw eigen computer via deze GitHub repository. De uitwerkingen staan op de branch _uitwerkingen_.

## Voor je begint

Je hebt IntelliJ IDEA en de JDK (Java Development Kit) versie 17 of hoger nodig - deze heb je beiden via de instructies op EdHub geïnstalleerd.

### 🟩 Code runnen (vanuit IntelliJ)
Klik op de groene play-knop voor de main-methode en kies 'Run...'.

### 🟨 Testen uitvoeren (vanuit IntelliJ)
Klik op de groene play-knop voor de MainTest-class in src/test/java en kies 'Run 'MainTest''.

### ⬛ Code runnen (met Maven)

Of, als je bekend bent met de terminal, kun je de applicatie runnen met:

```shell
./mvnw clean compile exec:java
```

of 

```shell
mvnw.cmd clean compile exec:java
```

## Opdracht

Zorg dat de juiste waardes worden toegewezen aan de variabelen in de `Main`-class in `src/main/java`, zodat de juiste waardes worden gelogd. Doorloop de code hiervoor van boven naar beneden en maak aanpassingen op de regels waar dit gevraagd wordt.

**Let op:** je mag een code aanpassen tenzij dit uitdrukkelijk wordt gevraagd commentaar erboven.

Om te valideren dat je klaar bent, kun je de testen draaien. In `src/test/java` vind je een class met de naam `MainTest`. Links daarvan staat een groen pijltje die je kunt gebruiken om te compileren en te testen. Onderin het scherm komt het resultaat te staan. Zijn niet alle testen groen? Kijk dan goed naar de uitslag van de test om te zien wat de verwachtte waarde is. Maak netzolang aanpassingen tot de testen allemaal groen worden.

### Stappenplan

_Let op_ het is uitdagender om jouw eigen stappenplan te maken. Als je niet zo goed weet waar je moet beginnen, kun je onderstaand stappenplan gebruiken

1. Het eerste deel van deze opdracht gaat over wiskundige operatoren. De eerste vraag is om het statement `int four = x` op te lossen. Wat is de huidige waarde van `x`?
2. Wanneer je weet wat de huidige waarde van `x` is, kun je bedenken welke operator je kunt gebruiken om daar `4` van te maken! _Tip_: 3 + 1 = 4...
3. Herhaal deze stappen voor de volgende regels, waarbij je rekening houdt met het volgende:

De wiskundige operaties zijn natuurlijk relatief simpel. Wat veel belangrijker is, is dat je goed rekening houdt met de typering van de variabelen. Zo zou je de eerste opdracht ook op kunnen lossen door te vermenigvuldigen met 1 1/3de. Dat slaat natuurlijk nergens op, maar het _kan_ wel. 1 1/3de is echter geen _integer_, maar een _fraction_. Fractions werken binnen Java anders dan in de wiskunde. Een wiskundige operatie met twee _int_'s resulteert altijd in een _int_. 1/3 is daardoor `0`. Java gooit dus alles achter de komma weg! Zelfs 9/10 is dus 0. 

Als we van één van de twee operands een _float_ of een _double_ maken, krijgen we wel netjes een kommagetal (`1 / 3f = 0.33333334`), maar dit is geen _int_. Aangezien je op zoek bent naar `int four` moeten beide operands dus van het type _int_ zijn.

Houd bij de volgende opgaves dus goed rekening met de types!

