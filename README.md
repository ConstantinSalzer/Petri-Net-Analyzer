# Petri Net Analyzer

A Java desktop application for loading, visualizing, and analyzing Petri nets.
Built as part of Module 63081 (Grundpraktikum Programmierung) at FernUniversität Hagen, SS 2025.

## Features

- **Load & visualize** Petri nets from PNML files
- **Fire transitions** interactively via mouse click
- **Reachability graph** — builds incrementally as you fire transitions
- **Boundedness analysis** — automatically determines if a Petri net is bounded or unbounded; highlights the witness path (m, m') for unbounded nets
- **Batch processing** — run boundedness analysis over multiple PNML files at once with tabular output

## Run

```bash
java -jar Petrinets_3756556_Salzer_Constantin.jar
```

Requires Java 21+.

## Tech Stack

- Java 21
- Swing (GUI)
- [GraphStream 2.0](https://graphstream-project.org) (graph visualization)
- PNML parser (PNMLWopedParser, provided by FernUni Hagen)

## Project Structure
src/                  Java source files
doc/                  Generated Javadoc
documentation/        PDF program documentation

## Screenshots
<img width="1011" height="626" alt="image" src="https://github.com/user-attachments/assets/c7d213c2-3c09-4296-b416-f06b1bb42d12" />
<img width="1918" height="1029" alt="image" src="https://github.com/user-attachments/assets/8e6648d2-3c08-45bf-9496-e22f6e08445f" />

