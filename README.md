Name: Hamza Siddiqui
Email: hhsiddiqui@oakland.edu
Course: CSI 3620 — Data Structures & Algorithms
Project: Optional Bonus Project — Max-Heap Priority To-Do List

Project Description

PriorityPlanner is a basic command line to-do list program where the user can create tasks that have priority values. Tasks are stored in a Max Heap, meaning that whatever task has the highest importance will be displayed at the top of the list. This allows users to easily see what assignment or project is most important and should be completed first.

Using PriorityPlanner, users are able to:

Add a new task with a selected priority (with priority 1 being the lowest and 100 being the highest)
Look at the highest-priority task without having to delete it
Finish the highest-priority task by deleting it
View a list of all active tasks.

Data Structure Used
Max Heap (Priority Queue)

I choose MaxHeap because
It always keeps the highest priority task at the top
Efficient operations:
Insert task → O(log n)
Remove highest priority task → O(log n)
Peek highest priority task → O(1)
The heap is stored in an array
heapifyUp() / heapifyDown() maintain priority order automatically.


How to Run the Program

Open terminal / command prompt
Change directory to cd src
Compile all java files using javac *.java
Run the peogram using java Main

What I Learned
How a Max Heap works internally using an array
Why heapifyUp and heapifyDown are needed
Managing priorities in a real-life example
Making a simple Java menu driven program


Future Improvement
Save tasks permanently to a file
Update a task’s priority after creation
Remove a specific task by description
Add a graphical interface in the future

AI Usage
All aspects of the PriorityPlanner development are my own; I designed, planned, and wrote the entire project including the max heap structure and all the menu functions. I used AI to assist me with a few minor corrections and enhancements on priority comparisons within the methods (insert(), peek(), and extractMax()). I also received some assistance with formatting output for better presentation. I tested the program completely by myself and have documented everything related to this project's demonstration. I understand the entire process of developing the program and the code itself through my own efforts.

GitHub Repository link
https://github.com/HamzaTechFusion/CSI-3620-Project

Project Recording (Video Demo)
https://drive.google.com/file/d/19WAGoZn5wDYs7IgITicA1VfSnIBEa5ND/view?usp=sharing



