# INF101 OOP Tetris Project

## About The Project
This repository is part of the Object-Oriented Programming (OOP) course (INF101) at the University of Bergen (UIB). It features a Java-based implementation of the classic Tetris game, designed to help students apply and understand various OOP principles such as encapsulation, polymorphism, inheritance, and the Model-View-Controller (MVC) architecture.

### Built With
- Java (Swing framework)

## Game Overview
This project implements a simplified version of the Tetris game, where players aim to clear rows of blocks by arranging falling pieces called Tetrominoes. The game consists of two main components:
- **Tetris Board**: A grid where the Tetrominoes fall and where completed rows are cleared.
- **Tetrominoes**: The shapes that fall, including I, O, T, S, Z, J, and L, which can be rotated and moved to fit within the grid.

### How It Works
The game is built using the Model-View-Controller (MVC) design pattern, structured into the following packages:
- **inf101.tetris.model**: Handles the game logic and data structures, including the board, Tetrominoes, and game state.
- **inf101.tetris.view**: Responsible for rendering the game board and the falling Tetrominoes.
- **inf101.tetris.controller**: Handles user input and manages game updates, such as moving the pieces and detecting when rows are completed.

### Game Controls
- **Arrow Keys**: Move the Tetromino left, right, or down.
- **Space Bar**: Drop the Tetromino to the bottom instantly.
- **Up Arrow**: Rotate the Tetromino clockwise.

## How to Play
1. Start the game, and a Tetromino will begin falling from the top of the board.
2. Use the arrow keys to position and rotate the piece to fit it within the grid.
3. Complete horizontal rows to clear them and earn points.
4. The game ends when there’s no more space for new pieces.

## MVC Architecture Overview
- **Model**: `TetrisModel` maintains the current state of the game, including the board and the active Tetromino. `TetrisBoard` represents the board, and `Tetromino` represents the shapes.
- **View**: `TetrisView` draws the current state of the game based on the model, ensuring separation between the game’s logic and its visual representation.
- **Controller**: `TetrisController` listens for user input and interacts with the model to update the game state accordingly.

MVC Architecture Overview
Model: TetrisModel maintains the current state of the game, including the board and the active Tetromino. TetrisBoard represents the board, and Tetromino represents the shapes.
View: TetrisView draws the current state of the game based on the model, ensuring separation between the game’s logic and its visual representation.
Controller: TetrisController listens for user input and interacts with the model to update the game state accordingly.

