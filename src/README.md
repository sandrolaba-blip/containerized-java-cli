# Containerized Java CLI Tool

## What the program does

This Java program collects information for two customers, including their name, email, and phone number. Each customer is stored as a Customer object in an ArrayList. The program then displays the stored customer information.

## How to build and run with Docker

Build the Docker image:

```bash
docker build -t laba-java-cli .
```

Run the Docker container:

```bash
docker run --rm -it laba-java-cli
```

The program will ask for the name, email, and phone number of two customers.

## Example Input

```text
Name: John Smith
Email: john@gmail.com
Phone: 555-123-4567

Name: Jane Doe
Email: jane@gmail.com
Phone: 555-987-6543
```

## Example Output

```text
===== Stored Customer Information =====

Customer 1:
Name: John Smith
Email: john@gmail.com
Phone: 555-123-4567

Customer 2:
Name: Jane Doe
Email: jane@gmail.com
Phone: 555-987-6543
```
