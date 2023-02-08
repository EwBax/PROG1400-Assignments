# PROG 1400 - Assignment 1

# JAVA AND OOP BASICS

*Assignment Value: 10*% of overall course mark.

*Due Date:* **See due date designated on the Assignment 1 dropbox on
Brightspace.**

Late submissions will receive the standard late submission penalty as
stated in the course outline.

#### Assignment Instructions: 

Use Eclipse to create a Java console application.

#### Submissions: 

#### You will submit your work for this assignment via Brightspace. It is this Dropbox submission that will be used to determine late penalties, so make sure to do so prior to the assignment deadline. 

#### Evaluation:

To insure the greatest chance of success on this assignment, be sure to
check the marking rubric contained at the end of this document or in
Brightspace. The rubric contains the criteria your instructor will be
assessing when marking your assignment.

## Program -- Fantasy Hockey

You have been asked to write a Java console application to track and
gather statistics for a fantasy hockey league. The application
requirements are as follows:

-   The league has 3 teams with 3 players per team.

-   The user will be presented with a set of data entry options for 3
    teams of 3 players (see console output below)

    -   For teams, gather the team name

    -   For players, gather the player name, number of goals and number
        of assists

    -   **Validation**: Names must be at least 3 characters long.
        Numbers must be zero or greater.

-   After gathering all the data, you will generate 2 reports (See
    example below):

    -   A team stats report that displays the following:

        -   Total goals and assists for the team.

        -   Team Budget and Rating based on number of assists and goals.

    -   A team will be given a random budget when created. The budget
        must be between zero and \$100000. The report must output the
        budget dollar amount to 2 decimal places.

    -   The team rating is calculated using the following formula:

        -   3 stars (\*\*\*) -- the total goals and assists is greater
            than 20

        -   2 stars (\*\*) -- the total goals and assists is greater
            than or equal to 10

        -   1 star (\*) -- the total goals and assists is greater than
            zero

        -   0 stars -- the total goals and assists is zero

    -   The Stats per player report will report the player team name,
        their name, the player number of goals, assists and the total
        (see below).

-   Program Organization: Make 3 Java classes: A Team class, A Player
    class and a Main class that launches the application, gathers input
    and displays output. Team and Player should have appropriate
    properties for their types. These classes should also have
    appropriate methods like outputPlayerDetails() etc.

## Examples and Testing

In the section below, you will be presented with console output of a
successful execution of a sample solution to the program, which should
help demonstrate how your input/output on the program should work. In
addition to the sample values used in the screenshot(s), there should be
validation on all inputs. You can expect your instructor to grade your
assignment by trying different values than below. **In other words, you
should thoroughly test your code before submitting!**

**Sample Output** - Make sure your program can output data *exactly* as
shown below. Bold Text is for user entry.

FANTASY HOCKEY APPLICATION

TEAM ENTRY

================================

Enter name for team \# 1:

**Ron\'s Top Picks**

Enter name for team \# 2:

**Best Team Around**

Enter name for team \# 3:

**My Random Picks**

PLAYER ENTRY

================================

Enter players for Ron\'s Top Picks:

Enter name for player \# 1:

**Jane Smith**

Enter number of goals for Jane Smith:

**5**

Enter number of assists for Jane Smith:

**2**

Enter name for player \# 2:

...

REPORT: Stats per Team

================================

Ron\'s Top Picks: G - 66 A - 63 Total - 129 Budget - \$69596.13

Rating: \*\*\* stars

Best Team Around:G - 2 A - 3 Total - 5 Budget - \$26706.63

Rating: \*\* stars

My Random Picks: G - 13 A - 13 Total - 26 Budget - \$50519.41

Rating: \*\*\* stars

REPORT: Stats per Player

================================

Ron\'s Top Picks

Jane Smith: G - 10 A - 5 Total - 15

Ron\'s Top Picks

Jack Jones: G - 30 A - 10 Total - 40

Ron\'s Top Picks

Tim Hockey: G - 16 A - 18 Total - 34

Ron\'s Top Picks

Mike Sears: G - 10 A - 30 Total - 40

Best Team Around

Jacob Jackson: G - 1 A -- 0 Total - 1

Best Team Around

Mahalia Roberts: G -- 0 A - 2 Total - 2

Best Team Around

Sally Sampson: G - 1 A -- 1 Total - 2

Best Team Around

Seigfried Smith: G - 0 A - 0 Total - 0

My Random Picks

Joe Murphy: G - 5 A - 3 Total - 8

My Random Picks

Ivor Callaly: G -- 3 A - 7 Total - 10

My Random Picks

Rory Kirby: G - 1 A - 1 Total - 2

My Random Picks

Sheila Moriarty: G - 4 A - 2 Total - 6

+-------+---+--------+----------+---------+--------------------+----+---+
| **Fa  |   |        |          |         |                    |    |   |
| ntasy |   |        |          |         |                    |    |   |
| Hoc   |   |        |          |         |                    |    |   |
| key** |   |        |          |         |                    |    |   |
+=======+===+========+==========+=========+====================+====+===+
| **    |   | **     | **Needs  | **Suf   | **Excellent (5     | *  | * |
| Crite |   | Insuff | Devel    | ficient | pts)**             | *M | * |
| ria** |   | icient | opment** | (3-4    |                    | ar | X |
|       |   | (0     |          | pts)**  |                    | ks | * |
|       |   | pts)** | **(1-2   |         |                    | ** | * |
|       |   |        | pts)**   |         |                    |    |   |
+-------+---+--------+----------+---------+--------------------+----+---+
| **    |   | Little | A        | A good  | -   All team and   |    |   |
| myutil.Input |   | to no  | re       | effort  |     player inputs  |    |   |
| /     |   | effort | asonable | was     |     can be         |    |   |
| Out   |   | was    | effort   | made,   |     successfully   |    |   |
| put** |   | made   | was      | but at  |     entered, and   |    |   |
|       |   | or     | made,    | least   |     use            |    |   |
| ** ** |   | co     | but      | one     |     descriptive    |    |   |
|       |   | ntains | there    | error   |     prompts        |    |   |
|       |   | too    | are      | or      |                    |    |   |
|       |   | many   | multiple | o       |                    |    |   |
|       |   | errors | areas    | mission |                    |    |   |
|       |   | /      | for      | exists. |                    |    |   |
|       |   | omis   | impr     |         |                    |    |   |
|       |   | sions. | ovement. |         |                    |    |   |
+-------+---+--------+----------+---------+--------------------+----+---+
|       |   |        |          |         | -   The report     |    |   |
|       |   |        |          |         |     output lines   |    |   |
|       |   |        |          |         |     are            |    |   |
|       |   |        |          |         |     well-formatted |    |   |
|       |   |        |          |         |     and contain    |    |   |
|       |   |        |          |         |     all expected   |    |   |
|       |   |        |          |         |     information    |    |   |
|       |   |        |          |         |                    |    |   |
|       |   |        |          |         | -   All output     |    |   |
|       |   |        |          |         |     values are     |    |   |
|       |   |        |          |         |     formatted,     |    |   |
|       |   |        |          |         |     where          |    |   |
|       |   |        |          |         |     appropriate,   |    |   |
|       |   |        |          |         |     using proper   |    |   |
|       |   |        |          |         |     currency       |    |   |
|       |   |        |          |         |     formatting     |    |   |
|       |   |        |          |         |     (e.g. preceded |    |   |
|       |   |        |          |         |     by a \$        |    |   |
|       |   |        |          |         |     symbol, two    |    |   |
|       |   |        |          |         |     decimal        |    |   |
|       |   |        |          |         |     places)        |    |   |
+-------+---+--------+----------+---------+--------------------+----+---+
| **    |   | Little | A        | A good  | Solution displays  |    |   |
| OOP** |   | to no  | re       | effort  | strong             |    | 2 |
|       |   | effort | asonable | was     | understanding of   |    |   |
|       |   | was    | effort   | made,   | OOP fundamentals.  |    |   |
|       |   | made   | was      | but at  | Classes are        |    |   |
|       |   | or     | made,    | least   | created, with all  |    |   |
|       |   | co     | but      | one     | required           |    |   |
|       |   | ntains | there    | error   | properties and     |    |   |
|       |   | too    | are      | or      | methods as         |    |   |
|       |   | many   | multiple | o       | expected.          |    |   |
|       |   | errors | areas    | mission | Constructors are   |    |   |
|       |   | /      | for      | exists. | included for each  |    |   |
|       |   | omis   | impr     |         | class (except      |    |   |
|       |   | sions. | ovement. |         | Main) and used     |    |   |
|       |   |        |          |         | appropriately.     |    |   |
|       |   |        |          |         | Object             |    |   |
|       |   |        |          |         | instantiation done |    |   |
|       |   |        |          |         | correctly and in   |    |   |
|       |   |        |          |         | the appropriate    |    |   |
|       |   |        |          |         | class (Main).      |    |   |
+-------+---+--------+----------+---------+--------------------+----+---+
| *     |   | Little | A        | A good  | Data input is      |    |   |
| *Data |   | to no  | re       | effort  | validated          |    |   |
| Va    |   | effort | asonable | was     | properly: integers |    |   |
| lidat |   | was    | effort   | made,   | must be equal to   |    |   |
| ion** |   | made   | was      | but at  | zero or above.     |    |   |
|       |   | or     | made,    | least   | Strings must be at |    |   |
|       |   | co     | but      | one     | least 3            |    |   |
|       |   | ntains | there    | error   | characters.        |    |   |
|       |   | too    | are      | or      |                    |    |   |
|       |   | many   | multiple | o       |                    |    |   |
|       |   | errors | areas    | mission |                    |    |   |
|       |   | /      | for      | exists. |                    |    |   |
|       |   | omis   | impr     |         |                    |    |   |
|       |   | sions. | ovement. |         |                    |    |   |
+-------+---+--------+----------+---------+--------------------+----+---+
| **R   |   | Little | A        | A good  | A random budget is |    |   |
| andom |   | to no  | re       | effort  | generated for each |    |   |
| Bud   |   | effort | asonable | was     | team and is in the |    |   |
| get** |   | was    | effort   | made,   | correct range.     |    |   |
|       |   | made   | was      | but at  |                    |    |   |
|       |   | or     | made,    | least   |                    |    |   |
|       |   | co     | but      | one     |                    |    |   |
|       |   | ntains | there    | error   |                    |    |   |
|       |   | too    | are      | or      |                    |    |   |
|       |   | many   | multiple | o       |                    |    |   |
|       |   | errors | areas    | mission |                    |    |   |
|       |   | /      | for      | exists. |                    |    |   |
|       |   | omis   | impr     |         |                    |    |   |
|       |   | sions. | ovement. |         |                    |    |   |
+-------+---+--------+----------+---------+--------------------+----+---+
| *     |   | Little | A        | A good  | Each team is       |    |   |
| *Team |   | to no  | re       | effort  | assigned the       |    |   |
| Rat   |   | effort | asonable | was     | correct rating,    |    |   |
| ing** |   | was    | effort   | made,   | according to       |    |   |
|       |   | made   | was      | but at  | program            |    |   |
|       |   | or     | made,    | least   | requirements.      |    |   |
|       |   | co     | but      | one     | Output is given    |    |   |
|       |   | ntains | there    | error   | with the right     |    |   |
|       |   | too    | are      | or      | number of stars.   |    |   |
|       |   | many   | multiple | o       |                    |    |   |
|       |   | errors | areas    | mission |                    |    |   |
|       |   | /      | for      | exists. |                    |    |   |
|       |   | omis   | impr     |         |                    |    |   |
|       |   | sions. | ovement. |         |                    |    |   |
+-------+---+--------+----------+---------+--------------------+----+---+
| *     |   | Little | A        | A good  | The team report is |    |   |
| *Team |   | to no  | re       | effort  | present and        |    |   |
| Rep   |   | effort | asonable | was     | displays expected  |    |   |
| ort** |   | was    | effort   | made,   | report data.       |    |   |
|       |   | made   | was      | but at  | Output is          |    |   |
|       |   | or     | made,    | least   | well-formatted,    |    |   |
|       |   | co     | but      | one     | clearly labeled    |    |   |
|       |   | ntains | there    | error   | and has an easily  |    |   |
|       |   | too    | are      | or      | readable layout.   |    |   |
|       |   | many   | multiple | o       |                    |    |   |
|       |   | errors | areas    | mission |                    |    |   |
|       |   | /      | for      | exists. |                    |    |   |
|       |   | omis   | impr     |         |                    |    |   |
|       |   | sions. | ovement. |         |                    |    |   |
+-------+---+--------+----------+---------+--------------------+----+---+
| **P   |   | Little | A        | A good  | The player report  |    |   |
| layer |   | to no  | re       | effort  | is present and     |    |   |
| Rep   |   | effort | asonable | was     | displays expected  |    |   |
| ort** |   | was    | effort   | made,   | report data.       |    |   |
|       |   | made   | was      | but at  | Output is          |    |   |
|       |   | or     | made,    | least   | well-formatted,    |    |   |
|       |   | co     | but      | one     | clearly labeled    |    |   |
|       |   | ntains | there    | error   | and has an easily  |    |   |
|       |   | too    | are      | or      | readable layout.   |    |   |
|       |   | many   | multiple | o       |                    |    |   |
|       |   | errors | areas    | mission |                    |    |   |
|       |   | /      | for      | exists. |                    |    |   |
|       |   | omis   | impr     |         |                    |    |   |
|       |   | sions. | ovement. |         |                    |    |   |
+-------+---+--------+----------+---------+--------------------+----+---+
| **    |   | Little | A        | A good  | Arrays are used to |    |   |
| Array |   | to no  | re       | effort  | store objects as   |    |   |
| &     |   | effort | asonable | was     | expected. Proper   |    |   |
| O     |   | was    | effort   | made,   | interaction with   |    |   |
| bject |   | made   | was      | but at  | object arrays is   |    |   |
| Us    |   | or     | made,    | least   | demonstrated.      |    |   |
| age** |   | co     | but      | one     |                    |    |   |
|       |   | ntains | there    | error   |                    |    |   |
|       |   | too    | are      | or      |                    |    |   |
|       |   | many   | multiple | o       |                    |    |   |
|       |   | errors | areas    | mission |                    |    |   |
|       |   | /      | for      | exists. |                    |    |   |
|       |   | omis   | impr     |         |                    |    |   |
|       |   | sions. | ovement. |         |                    |    |   |
+-------+---+--------+----------+---------+--------------------+----+---+
| **Com |   | Little | A        | A good  | Organizational or  |    |   |
| ments |   | to no  | re       | effort  | explanatory        |    |   |
| &     |   | effort | asonable | was     | comments are used  |    |   |
| Best  |   | was    | effort   | made,   | extensively, most  |    |   |
| C     |   | made   | was      | but at  | are meaningful and |    |   |
| oding |   | or     | made,    | least   | easily understood. |    |   |
| P     |   | co     | but      | one     | A consistent       |    |   |
| racti |   | ntains | there    | error   | naming convention  |    |   |
| ces** |   | too    | are      | or      | was used for most  |    |   |
|       |   | many   | multiple | o       | of the program and |    |   |
| (At   |   | errors | areas    | mission | deviated very      |    |   |
| least |   | /      | for      | exists. | little. Source     |    |   |
| 60%   |   | omis   | impr     |         | code was clean,    |    |   |
| of    |   | sions. | ovement. |         | consistently       |    |   |
| the   |   |        |          |         | well-formatted and |    |   |
| funct |   |        |          |         | easy to read.      |    |   |
| ional |   |        |          |         |                    |    |   |
| re    |   |        |          |         |                    |    |   |
| quire |   |        |          |         |                    |    |   |
| ments |   |        |          |         |                    |    |   |
| must  |   |        |          |         |                    |    |   |
| be    |   |        |          |         |                    |    |   |
| comp  |   |        |          |         |                    |    |   |
| lete) |   |        |          |         |                    |    |   |
+-------+---+--------+----------+---------+--------------------+----+---+
|       |   |        |          |         | **Total:**         |    | * |
|       |   |        |          |         |                    |    | * |
|       |   |        |          |         |                    |    | / |
|       |   |        |          |         |                    |    | 5 |
|       |   |        |          |         |                    |    | 0 |
|       |   |        |          |         |                    |    | * |
|       |   |        |          |         |                    |    | * |
+-------+---+--------+----------+---------+--------------------+----+---+
