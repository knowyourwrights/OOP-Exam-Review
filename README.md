# OOP Coding Test — Review and Reflection

## 1. My Original Examination Grade

### Task 1 — 21/40
**My mark:**
5 + 5 + 1 = 10/15, 3/15, 8/10

**Why I awarded this mark:**
- 5 + 5 + 1 = workshopName, capacity present and functioning. HashSet present but not functioning
which is especially bad because it crashes the rest of the program/.
- 3 = Constructor attempted but not present in uncommented code/functioning.
- 8 = If not for the errors relating to the HashSet, code would run correctly.

### Task 2 — 28/40
**My mark:** 10/10, 10/10, 2/10, 6/10
**Why I awarded this mark:**
- 10/10 = Registration attempts functions correctly.
- 10/10 = Same ID rejected functions correctly.
- 2/10 = Question interpreted incorrectly resulting in additional "while" loop on line 23. Program
functions correctly only when assuming that the incorrect interpretation was the one the test was
referring to all along.
- 6/10 = Accepted and duplicate messages are displayed, but full workshop does not due to the
"while" loop serving that purpose already.

### Task 3 — 14/20
**My mark:** 3/5, 5/5, 5/5, 1/5

**Why I awarded this mark:**
- 3/5 = Student IDs print, but first ID is printed in a strange format. The fixed program includes
a .toString() which solves this issue.
- 5/5 = Total accepted and rejected attempts display correctly.
- 5/5 = Places remaining display correctly.
- 1/5 = Rejection of blank student IDs was attempted in Workshop.java using an exception but
VSCode seemed to ignore/continue to wait for input even when enter or space + enter was pressed.
Should have worked in theory but not able to be tested.

**Total self-assessed grade:** 63/100

## 2. Corrections and Improvements

**Describe two or three important problems you identified
in your original code. Explain what you changed and
why it works now.**

- I removed the nested "while" loop on line 23 of my original code. I removed it because the program
was supposed to go ahead even if the capacity was at its maximum. I forgot about this while I was
coding.

- I fixed the studentIDs HashSet because it was implemented incorrectly. I replaced it with a new
HashSet called registrations. In the original code I had "private Set<String> studentIDs;", and it was only
in Workshop.java . In the new program I have "HashSet<String> registrations = new HashSet<>();", and it is
in both Workshop.java and Main.java .

- I completely forgot about the constructor for Workshop.java . I didn't come across any issues
that would've been caused by it, but my program likely would not have worked without it. The
new program includes a constructor.

## 3. Reflection

**What did you understand during the examination
but struggle to implement?**

The HashSet. It was the source of pretty much all of my errors, and it was because of the incorrectly
implemented HashSet that my code did not run, meaning I have/had no idea if the rest of my code was
actually working or not. The skeleton for the rest of my code/the tasks is there.

**What was the most important thing you learned
from correcting your code?**

Rereading the question each time a task is complete is important. The additional "while" loop, for example,
was included because I had stopped checking the required output on the back of the test & was working off
of my own logic rather than what the test was asking me to do. 

**What would you do differently in your next
coding test?**

Reread the question multiple times and potentially bring a sheet of paper so that I can write down
each step. That way I'd have a clear plan and wouldn't get lost in my own code.

---

## Review lab assessment and mark recovery

The **review lab** is graded separately out of 20 marks:

| Review criterion | Maximum marks |
|---|---:|
| Original self-assessment and supporting evidence | 4 |
| Explanation of mistakes and Java concepts | 6 |
| Corrections and improvements | 4 |
| Testing and demonstration | 4 |
| Reflection | 2 |
| **TOTAL** | **20** |

You can recover **up to 30% of the marks you lost** in the original examination. The actual amount depends on your review lab grade. Your lecturer's examination grade, **not your self-awarded mark**, is used in the calculation.

**Marks recovered = (100 − original exam mark) × 0.30 × (review lab mark ÷ 20)**

**Revised exam mark = original exam mark + marks recovered**

For example, an original examination mark of 40/100 and a review lab mark of 16/20 would recover 14.4 marks, giving a revised result of **54.4/100**.

The aim is to show that you understand your mistakes and can explain your improvements. Simply copying a working solution does not demonstrate this understanding.

