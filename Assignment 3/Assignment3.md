# PROG 1400 - Assignment 3

# OOP and GUI

*Assignment Value: 12*% of overall course mark.

*Due Date:* **See due dates designated on Assignment 3 dropboxe on
Brightspace.**

Late submissions will receive the standard late submission penalty as
stated in the course outline.

#### Assignment Instructions: 

Use Eclipse to create a Java Swing UI application.

#### Submissions: 

#### You will submit your work for this assignment via Brightspace. **All files required to run the project (Main(), external files/folders like images, text files, etc.) must be included in the upload.** 

#### Submit a simple text document to the Brightspace. It is this Dropbox submission that will be used to determine late penalties, so make sure to do so prior to the assignment deadline. 

#### Evaluation:

To insure the greatest chance of success on this assignment, be sure to
check the marking rubric contained at the end of this document or in
Brightspace. The rubric contains the criteria your instructor will be
assessing when marking your assignment.

## Program -- RPG Character Creation

### Design and Coding

Prior to coding the application, you should work out a design for the
objects in your application. This will be diagrammed using Visio. For
example, each Character in the system (either Player or Monster) shares
a common attribute of **Name**. Make sure your classes do not duplicate
any code by using Java inheritance to share these common attributes and
methods. Upload the Visio diagram as a JPEG or PNG along with your
source code.

Some guidelines for the UML diagram:

-   All classes in your program (besides Main) should be included in the
    class diagram.

-   Your Character class hierarchy must have at least three levels of
    inheritance (including Character).

-   At least two character types (ex. Warrior, Wizard, etc.) and at
    least two weapon or armour types must be included. A class for
    Monster should also be included.

-   Your solution must include at least one example of aggregation or
    composition (has-a, instead of is-a). Suggested classes for
    aggregation: Weapon or Armour.

-   All classes, attributes and methods should follow proper UML class
    diagram standards and conventions.

-   Include constructors and over-ridden methods such as toString().

-   Line indicators denoting inheritance, association or aggregation
    should be included wherever required.

### Program Requirements

Use Java and Java Swing to create a simple graphical role-playing game,
including an opening splash screen, a simple character creation screen
and a battle summary screen.

#### Screen Descriptions

The splash screen will have a title, and image and a button to progress
to the creation screen.

The character creation screen will allow the user to enter a character
name, choose a character type (ex. Warrior, Wizard, etc.), randomly
reroll the character stats, and select a weapon (ex. Sword, Dagger,
etc.). It will also have a button to progress to the battle summary
screen.

The battle summary screen will display the selected character's name,
class and image, randomly select a monster, then display all stats for
both the player and the selected monster.

#### Program Structure

Your program must use inherited classes for the program Frame and each
of the three screens (as Panels), as well as for the different
characters, character types, weapons and monsters.

Each of your classes should make proper use of constructors, getter and
setter methods, as well as any standard methods you deem necessary.

Your solution should also include at least one example of an abstract
class and at least one abstract method. Examples of static properties or
methods should also be included.

While it is good practice to validate all user-entered data in any
program, it is not required in this program.

### Sample Screenshots

###### Splash Screen

![](media/image1.png){width="4.009468503937008in"
height="4.052601706036746in"}

###### Character Creation Screen -- At Start

![](media/image2.png){width="4.621786964129484in"
height="4.696606517935258in"}

###### Character Creation Screen -- After Creating a Character

![](media/image3.png){width="4.861601049868766in"
height="4.907424540682415in"}

###### Battle Summary Screen

![](media/image4.png){width="4.7577252843394575in"
height="4.815246062992126in"}

+-------+----------+----------+----------+----------------------+---+---+
| **RPG |          |          |          | Name:                |   |   |
| Char  |          |          |          | \_                   |   |   |
| acter |          |          |          | \_\_\_\_\_\_\_\_\_\_ |   |   |
| Creat |          |          |          | \_\_\_\_\_\_\_\_\_\_ |   |   |
| ion** |          |          |          | \_\_\_\_\_\_\_\_\_\_ |   |   |
+=======+==========+==========+==========+======================+===+===+
| **    | **Insu   | **Needs  | **Su     | **Excellent (5       | * | * |
| Crite | fficient | Imp      | fficient | pts)**               | * | * |
| ria** | (0       | rovement | (3-4     |                      | M | X |
|       | pts)**   | (1-2     | pts)**   |                      | a | * |
|       |          | pts)**   |          |                      | r | * |
|       |          |          |          |                      | k |   |
|       |          |          |          |                      | * |   |
|       |          |          |          |                      | * |   |
+-------+----------+----------+----------+----------------------+---+---+
| **    | Su       | An       | A good   | Submission           |   | x |
| Class | bmission | effort   | effort,  | d                    |   | 2 |
| Diag  | missing  | was      | but      | emonstrates a strong |   |   |
| ram** | e        | made,    | su       | understanding        |   |   |
|       | ntirely, | but su   | bmission | of class diagram     |   |   |
|       | or it    | bmission | has a    | concepts, meets all  |   |   |
|       | contains | has      | few      | requirements and     |   |   |
|       | too many | multiple | issues   | fully covers the     |   |   |
|       | issues   | issues,  | and/or   | expected scope of    |   |   |
|       | and/or   | major    | areas    | the program. Proper  |   |   |
|       | om       | issues,  | for      | UML notation is used |   |   |
|       | issions. | or       | impr     | throughout. Displays |   |   |
|       |          | om       | ovement. | a high level of      |   |   |
|       |          | issions. |          | analysis, planning   |   |   |
|       |          |          |          | and attention to     |   |   |
|       |          |          |          | detail. Submission   |   |   |
|       |          |          |          | is well-formatted,   |   |   |
|       |          |          |          | proofread and        |   |   |
|       |          |          |          | presentable.         |   |   |
+-------+----------+----------+----------+----------------------+---+---+
| **Pr  | Missing  | An       | A good   | Program works as     |   |   |
| ogram | e        | effort   | effort,  | expected, with all   |   |   |
| Requ  | ntirely, | was      | but has  | required             |   |   |
| ireme | or it    | made,    | a few    | functionality, and   |   |   |
| nts** | contains | but has  | issues   | runs without errors. |   |   |
|       | too many | multiple | and/or   |                      |   |   |
|       | issues   | issues,  | areas    |                      |   |   |
|       | and/or   | major    | r        |                      |   |   |
|       | om       | p        | equiring |                      |   |   |
|       | issions. | roblems, | imp      |                      |   |   |
|       |          | or       | rovement |                      |   |   |
|       |          | om       |          |                      |   |   |
|       |          | issions. |          |                      |   |   |
+-------+----------+----------+----------+----------------------+---+---+
| *     | Missing  | An       | A good   | The user interface   |   |   |
| *UI** | e        | effort   | effort,  | is properly          |   |   |
|       | ntirely, | was      | but has  | structured,          |   |   |
|       | or it    | made,    | a few    | functional,          |   |   |
|       | contains | but has  | issues   | appropriate and easy |   |   |
|       | too many | multiple | and/or   | to use. Layout is    |   |   |
|       | issues   | issues,  | areas    | clean and            |   |   |
|       | and/or   | major    | r        | well-formatted.      |   |   |
|       | om       | p        | equiring |                      |   |   |
|       | issions. | roblems, | imp      |                      |   |   |
|       |          | or       | rovement |                      |   |   |
|       |          | om       |          |                      |   |   |
|       |          | issions. |          |                      |   |   |
+-------+----------+----------+----------+----------------------+---+---+
| **Inh | Missing  | An       | A good   | Program includes     |   | x |
| erita | e        | effort   | effort,  | example(s) of        |   | 2 |
| nce** | ntirely, | was      | but has  | inheritance, and     |   |   |
|       | or it    | made,    | a few    | implementation       |   |   |
|       | contains | but has  | issues   | demonstrates a       |   |   |
|       | too many | multiple | and/or   | strong conceptual    |   |   |
|       | issues   | issues,  | areas    | understanding.       |   |   |
|       | and/or   | major    | r        |                      |   |   |
|       | om       | p        | equiring |                      |   |   |
|       | issions. | roblems, | imp      |                      |   |   |
|       |          | or       | rovement |                      |   |   |
|       |          | om       |          |                      |   |   |
|       |          | issions. |          |                      |   |   |
+-------+----------+----------+----------+----------------------+---+---+
| **Agg | Missing  | An       | A good   | Program includes     |   |   |
| regat | e        | effort   | effort,  | example(s) of        |   |   |
| ion** | ntirely, | was      | but has  | aggregation, and     |   |   |
|       | or it    | made,    | a few    | implementation       |   |   |
|       | contains | but has  | issues   | demonstrates a       |   |   |
|       | too many | multiple | and/or   | strong conceptual    |   |   |
|       | issues   | issues,  | areas    | understanding.       |   |   |
|       | and/or   | major    | r        |                      |   |   |
|       | om       | p        | equiring |                      |   |   |
|       | issions. | roblems, | imp      |                      |   |   |
|       |          | or       | rovement |                      |   |   |
|       |          | om       |          |                      |   |   |
|       |          | issions. |          |                      |   |   |
+-------+----------+----------+----------+----------------------+---+---+
| **A   | Missing  | An       | A good   | Program includes     |   |   |
| bstra | e        | effort   | effort,  | example(s) of        |   |   |
| ction | ntirely, | was      | but has  | abstracted           |   |   |
| --    | or it    | made,    | a few    | classes/methods, and |   |   |
| Cl    | contains | but has  | issues   | implementation       |   |   |
| asses | too many | multiple | and/or   | demonstrates a       |   |   |
| &     | issues   | issues,  | areas    | strong conceptual    |   |   |
| Meth  | and/or   | major    | r        | understanding.       |   |   |
| ods** | om       | p        | equiring |                      |   |   |
|       | issions. | roblems, | imp      |                      |   |   |
|       |          | or       | rovement |                      |   |   |
|       |          | om       |          |                      |   |   |
|       |          | issions. |          |                      |   |   |
+-------+----------+----------+----------+----------------------+---+---+
| *     | Missing  | An       | A good   | Program includes a   |   |   |
| *Cons | e        | effort   | effort,  | multi-parameter      |   |   |
| truct | ntirely, | was      | but has  | constructor to       |   |   |
| ors** | or it    | made,    | a few    | populate at least    |   |   |
|       | contains | but has  | issues   | some of the          |   |   |
|       | too many | multiple | and/or   | properties of a game |   |   |
|       | issues   | issues,  | areas    | character object     |   |   |
|       | and/or   | major    | r        | using data taken     |   |   |
|       | om       | p        | equiring | from the user        |   |   |
|       | issions. | roblems, | imp      | interface at         |   |   |
|       |          | or       | rovement | runtime. Use of      |   |   |
|       |          | om       |          | class                |   |   |
|       |          | issions. |          | cons                 |   |   |
|       |          |          |          | tructors demonstrate |   |   |
|       |          |          |          | a strong conceptual  |   |   |
|       |          |          |          | understanding.       |   |   |
+-------+----------+----------+----------+----------------------+---+---+
| **    | Missing  | An       | A good   | Classes interact     |   |   |
| Class | e        | effort   | effort,  | using appropriate    |   |   |
| Inter | ntirely, | was      | but has  | techniques, through  |   |   |
| activ | or it    | made,    | a few    | ge                   |   |   |
| ity** | contains | but has  | issues   | tter/setter/standard |   |   |
|       | too many | multiple | and/or   | methods, using       |   |   |
|       | issues   | issues,  | areas    | static properties    |   |   |
|       | and/or   | major    | r        | where appropriate.   |   |   |
|       | om       | p        | equiring |                      |   |   |
|       | issions. | roblems, | imp      |                      |   |   |
|       |          | or       | rovement |                      |   |   |
|       |          | om       |          |                      |   |   |
|       |          | issions. |          |                      |   |   |
+-------+----------+----------+----------+----------------------+---+---+
| *     | Missing  | An       | A good   | Program demonstrates |   |   |
| *Code | e        | effort   | effort,  | reasonable code      |   |   |
| Ef    | ntirely, | was      | but has  | efficiency. (e.g.    |   |   |
| ficie | or it    | made,    | a few    | large segments of    |   |   |
| ncy** | contains | but has  | issues   | code that could be   |   |   |
|       | too many | multiple | and/or   | shorter, unnecessary |   |   |
|       | issues   | issues,  | areas    | code duplication,    |   |   |
|       | and/or   | major    | r        | code not             |   |   |
|       | om       | p        | equiring | encapsulated in      |   |   |
|       | issions. | roblems, | imp      | functions, etc.)     |   |   |
|       |          | or       | rovement |                      |   |   |
|       |          | om       |          |                      |   |   |
|       |          | issions. |          |                      |   |   |
+-------+----------+----------+----------+----------------------+---+---+
| **Com | Little   | A        | A good   | Organizational or    |   |   |
| ments | to no    | re       | effort   | explanatory comments |   |   |
| &     | effort   | asonable | was      | are used             |   |   |
| Best  | was made | effort   | made,    | extensively, most    |   |   |
| C     | or       | was      | but at   | are meaningful and   |   |   |
| oding | contains | made,    | least    | easily understood. A |   |   |
| P     | too many | but      | one      | consistent naming    |   |   |
| racti | errors / | there    | error or | convention was used  |   |   |
| ces** | om       | are      | omission | for most of the      |   |   |
|       | issions. | multiple | exists.  | program and deviated |   |   |
| (At   |          | areas    |          | very little. Source  |   |   |
| least |          | for      |          | code was clean,      |   |   |
| 60%   |          | impr     |          | consistently         |   |   |
| of    |          | ovement. |          | well-formatted and   |   |   |
| the   |          |          |          | easy to read.        |   |   |
| reqs  |          |          |          |                      |   |   |
| must  |          |          |          |                      |   |   |
| be    |          |          |          |                      |   |   |
| comp  |          |          |          |                      |   |   |
| lete) |          |          |          |                      |   |   |
+-------+----------+----------+----------+----------------------+---+---+
|       |          |          | **       |                      | * |   |
|       |          |          | Total:** |                      | * |   |
|       |          |          |          |                      | / |   |
|       |          |          |          |                      | 6 |   |
|       |          |          |          |                      | 0 |   |
|       |          |          |          |                      | * |   |
|       |          |          |          |                      | * |   |
+-------+----------+----------+----------+----------------------+---+---+
