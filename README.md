# StoryBuilder AI
Building stories, one word at a time - powered by smart hash maps!

A Java application that analyzes writing patterns from any text and generates new stories in the same style using custom hash maps and quadratic probing.

# Overview
StoryBuilder AI reads books or articles, learns how words connect, and then creates original content that mimics the writing style. It's like having a writing assistant that studies your favorite authors!

# How It Works
## Learning Phase:

- Reads source text (like "Emma" by Jane Austen)

- Builds a word relationship map using hash tables

- Tracks which words typically follow other words

## Generation Phase:

- Starts with a sentence beginning

- Chooses each next word based on learned patterns

- Creates coherent text that sounds like the original author

# Features
📖 Text Analysis: Learns from any book or document

✍️ Story Generation: Creates new content in the same style

⚡ Smart Hash Maps: Custom quadratic probing implementation

📊 Word Statistics: Analyzes frequency and patterns

🎯 Customizable Output: Control length and formatting

# Quick Start
## Prerequisites
- Java JDK 21+
- A text file to analyze

# Basic Usage

    public class Main {
        public static void main(String[] args) {
            StoryBuilderAI writer = new StoryBuilderAI("my_book.txt");
            writer.generateStory(300); // Generate a 300-word story
        }
    }

# Analyze Word Patterns

    // See the most common words in your text
    WordAnalyzer.main(new String[]{});

# Project Structure

    StoryBuilderAI/
    ├── src/
    │   ├── Main.java                    # Demo runner
    │   ├── StoryBuilderAI.java          # Main story generator
    │   ├── QuadraticProbingHashTable.java  # Custom hash map
    │   ├── WordAnalyzer.java            # Text analysis utility
    │   └── MapADT.java                  # Map interface
    ├── stories/                         # Your text files here
    │   └── emma_jane_austen.txt
    └── README.md

# Example
## Input Text:

    "It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife."

## Generated Story:

    "It is a truth well understood that a young woman of good family must be in search of proper companionship and the comforts of a established home with all the dignity that such situation affords to those who understand the importance of social standing in matters of the heart..."

# How to Use
- Add your text file to the project folder

- Run the generator with your filename

- Specify how many words you want to generate

- Read your new story in the console output

# Customization
- Adjust the story length by changing the number in generateStory()

- Use different source texts to get different writing styles

- Modify the word analysis to focus on specific patterns

# Technical Details
- Uses quadratic probing hash tables for efficient word storage

- Implements custom iterators for easy data access

- Handles large texts efficiently with optimized algorithms

# Need Help?
File not found? Make sure your text file is in the right folder

Memory issues? Very large books might need more heap space

Weird output? Try with a cleaner source text file

**Built to demonstrate the power of data structures in creative applications**

_What story will you build today?_

## Developer
  Developed by Sanjina Kumari at Pacific Lutheran University.
 
  For questions or feedback, feel free to reach out at sanjinamandhwani1@gmail.com!

## 📜 Acknowledgements
Project inspired by coursework in **CSCI 270 at Pacific Lutheran University**.  

Starter dataset and UML guidance provided by faculty.  
