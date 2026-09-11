# Sci-Fi Detective Game

## Problem Statement

Investigation processes involve collecting information, examining evidence, questioning individuals, and making decisions based on available clues. These processes can be represented through an interactive software simulation.

This project develops a Java-based investigation simulation where users explore locations, collect evidence, question suspects, solve puzzles, and use the gathered information to resolve a fictional case.

The system demonstrates object-oriented programming, modular design, collections, input handling, and logical decision-making through an interactive application.

## Project Goal

To model a structured investigation workflow using Java while demonstrating core object-oriented and modular programming concepts.

## Overview

Sci-Fi Detective Game is a command-line based mystery investigation game developed in Java.

The player takes the role of a detective investigating a mysterious incident on Nova Station. The player must explore different locations, collect evidence, question suspects, solve a security puzzle, and use the collected information to identify the person responsible for the incident.

The project demonstrates object-oriented programming and modular programming concepts in Java through an interactive investigation-based application.

## Features

- Interactive command-line game interface
- Player name and investigation setup
- Exploration of different locations on Nova Station
- Evidence collection and evidence viewing
- Player inventory management
- Suspect profiles and suspect interviews
- Evidence comparison during investigation
- Puzzle-solving system
- Location unlocking based on investigation progress
- Investigation progress tracking
- Final suspect accusation and case resolution
- Correct and incorrect accusation outcomes
- Input validation and error handling

## Technologies Used

- Java
- Java Collections Framework
- Object-Oriented Programming
- Command-Line Interface (CLI)
- VS Code
- Git and GitHub

## Project Structure
```

SciFiDetectiveGame/
- Main.java
- Game.java
- Player.java
- Evidence.java
- Suspect.java
- Investigation.java
- Puzzle.java
- README.md
- statement.md
```

## Code Structure

* **Main.java** – The entry point of the application. It creates the `Game` object and starts the game.
* **Game.java** – Controls the main game flow, menus, exploration, suspect investigation, puzzle solving, and case resolution.
* **Player.java** – Stores player information and manages the player's inventory.
* **Evidence.java** – Represents evidence collected during the investigation and stores its description and status.
* **Suspect.java** – Represents suspects involved in the case and stores their information, statements, and questioning status.
* **Investigation.java** – Manages the overall investigation state, including evidence, suspects, puzzles, progress, and unlocked locations.
* **Puzzle.java** – Represents puzzles in the game and handles answer validation and puzzle completion.

## Requirements

* Java Development Kit (JDK) 17 or later
* A Java-compatible terminal or command prompt
* Git (if cloning the repository)

## How to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/ameeshi25bai10220-oss/SciFiDetectiveGame.git
   ```

2. **Open the project folder:**
   ```bash
   cd SciFiDetectiveGame
   ```

3. **Compile the Java files:**
   ```bash
   javac Main.java Game.java Player.java Evidence.java Suspect.java Investigation.java Puzzle.java
   ```

4. **Run the application:**
   ```bash
   java Main
   ```

*Note: The game runs directly in the command line and does not require any additional libraries or external software.*

## How to Play

1. Start the game and enter the detective's name.
2. Read the case information about the incident on Nova Station.
3. Use the main menu to explore the available locations.
4. Collect evidence from different locations.
5. View the collected evidence and inventory.
6. Investigate and question the suspects.
7. Compare suspect statements with collected evidence.
8. Solve the security terminal puzzle to unlock the Security Office.
9. Collect additional evidence from the unlocked location.
10. Continue the investigation until enough information has been collected.
11. Choose a suspect during the final case resolution.
12. The game evaluates the accusation and displays the outcome.

## Testing

The application was tested through multiple complete gameplay runs. The following features were verified:

* Starting the game and entering a player name
* Displaying case information
* Exploring available locations
* Collecting evidence
* Viewing inventory and collected evidence
* Viewing suspect information and questioning all suspects
* Solving the security terminal puzzle and unlocking the Security Office
* Collecting evidence from the Security Office
* Tracking investigation progress
* Making correct and incorrect accusations
* Handling invalid menu input
* Exiting the game correctly

The complete investigation flow was successfully tested from the initial case briefing through final case resolution.

## Future Enhancements

The current version focuses on a command-line implementation. Future versions could include:

* Graphical user interface (GUI)
* Images for rooms, objects, and evidence
* Sound effects and background music
* Multiple investigation cases
* More complex puzzles and detailed branching dialogue
* Additional suspects and locations
* Save and load functionality
* Improved scoring and case evaluation
* A more advanced game interface

## Author

Developed as a Java course project by **Ameeshi Khare**.

## License

This project was developed for academic purposes.
