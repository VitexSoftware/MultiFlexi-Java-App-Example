# MultiFlexi Java App Example

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://openjdk.java.net/projects/jdk/21/)
[![Maven](https://img.shields.io/badge/Maven-3.6+-blue.svg)](https://maven.apache.org/)

A comprehensive Java application example demonstrating integration with the MultiFlexi framework. This application showcases how to build Java-based MultiFlexi applications that can read environment variables and configuration data, process them, and output structured JSON results.

## 🚀 Features

- **Environment Variable Processing**: Reads MultiFlexi-specific environment variables
- **Configuration Management**: Uses `.env` files for local development
- **JSON Output**: Generates structured JSON output for integration with MultiFlexi
- **Flexible Output**: Supports both console output and file output
- **MultiFlexi Integration**: Fully compatible with the MultiFlexi application framework

## 📋 Table of Contents

- [Features](#-features)
- [Prerequisites](#-prerequisites)
- [Installation](#-installation)
- [Configuration](#-configuration)
- [Usage](#-usage)
- [Environment Variables](#-environment-variables)
- [MultiFlexi Integration](#-multiflexi-integration)
- [Building](#-building)
- [Contributing](#-contributing)
- [License](#-license)

## ✅ Prerequisites

- **Java 21** or higher
- **Maven 3.6+**
- **MultiFlexi framework** (for production deployment)

## 🔧 Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/VitexSoftware/MultiFlexi-Java-App-Example.git
   cd MultiFlexi-Java-App-Example
   ```

2. **Build the project:**

   ```bash
   mvn clean compile
   ```

3. **Create a `.env` file** (optional for local development):

   ```bash
   cp .env.example .env
   # Edit .env with your configuration
   ```

## ⚙️ Configuration

The application can be configured using environment variables or a `.env` file. Create a `.env` file in the project root:

```env
# MultiFlexi Configuration
MULTIFLEXI_VERSION=1.0.0
MULTIFLEXI_COMPANY_ID=1
MULTIFLEXI_RUNTEMPLATE_ID=1
MULTIFLEXI_APPLICATION_UUID=d4b3fdf8-98ce-442c-bb25-e5f91965a08b
MULTIFLEXI_APPLICATION_ID=java-example
MULTIFLEXI_JOB_ID=12345
MULTIFLEXI_COMPANY_NAME="Example Company"
MULTIFLEXI_EXECUTOR=java-executor
MULTIFLEXI_APPLICATION_NAME="Java App Example"
MULTIFLEXI_RUNTEMPLATE_NAME="Example Template"
MULTIFLEXI_COMPANY_CODE=EXAMPLE

# Logging Configuration
EASE_LOGGER=console

# Output Configuration
RESULT_FILE=java-example_report.json
```

## 🎯 Usage

### Running the Application

**Using Maven:**

```bash
mvn exec:java
```

**Using compiled JAR:**

```bash
java -jar target/mutliflexi_java_app_example-1.0-SNAPSHOT.jar
```

**With environment variables:**

```bash
MULTIFLEXI_COMPANY_NAME="My Company" RESULT_FILE=output.json java -jar target/mutliflexi_java_app_example-1.0-SNAPSHOT.jar
```

### Output

The application will output a JSON structure containing all MultiFlexi environment variables:

```json
{
    "MULTIFLEXI_VERSION": "1.0.0",
    "MULTIFLEXI_COMPANY_ID": "1",
    "MULTIFLEXI_RUNTEMPLATE_ID": "1",
    "MULTIFLEXI_APPLICATION_UUID": "d4b3fdf8-98ce-442c-bb25-e5f91965a08b",
    "MULTIFLEXI_APPLICATION_ID": "java-example",
    "MULTIFLEXI_JOB_ID": "12345",
    "MULTIFLEXI_COMPANY_NAME": "Example Company",
    "MULTIFLEXI_EXECUTOR": "java-executor",
    "MULTIFLEXI_APPLICATION_NAME": "Java App Example",
    "MULTIFLEXI_RUNTEMPLATE_NAME": "Example Template",
    "MULTIFLEXI_COMPANY_CODE": "EXAMPLE",
    "EASE_LOGGER": "console"
}
```

## 🔐 Environment Variables

| Variable | Description | Required | Default |
|----------|-------------|----------|---------|
| `MULTIFLEXI_VERSION` | MultiFlexi framework version | No | - |
| `MULTIFLEXI_COMPANY_ID` | Unique company identifier | No | - |
| `MULTIFLEXI_RUNTEMPLATE_ID` | Run template identifier | No | - |
| `MULTIFLEXI_APPLICATION_UUID` | Application UUID | No | - |
| `MULTIFLEXI_APPLICATION_ID` | Application identifier | No | - |
| `MULTIFLEXI_JOB_ID` | Job execution identifier | No | - |
| `MULTIFLEXI_COMPANY_NAME` | Company display name | No | - |
| `MULTIFLEXI_EXECUTOR` | Executor name | No | - |
| `MULTIFLEXI_APPLICATION_NAME` | Application display name | No | - |
| `MULTIFLEXI_RUNTEMPLATE_NAME` | Run template display name | No | - |
| `MULTIFLEXI_COMPANY_CODE` | Company code | No | - |
| `EASE_LOGGER` | Logging method (console/syslog) | No | `console` |
| `RESULT_FILE` | Output file path | No | stdout |
| `APP_DEBUG` | Enable debug mode | No | `false` |

## 🔗 MultiFlexi Integration

This application is designed to work seamlessly with the MultiFlexi framework. The included MultiFlexi configuration file (`multiflexi/abraflexi_java_app.multiflexi.app.json`) defines:

- **Application Metadata**: Name, description, and UUID
- **Environment Variables**: Configuration options and their types
- **Executable Information**: How MultiFlexi should run the application

### MultiFlexi Configuration

```json
{
  "$schema": "https://raw.githubusercontent.com/VitexSoftware/php-vitexsoftware-multiflexi-core/refs/heads/main/multiflexi.app.schema.json",
  "schemaVersion": "3.2.1",
  "uuid": "d4b3fdf8-98ce-442c-bb25-e5f91965a08b",
  "name": "",
  "description": {
    "en": "Java App Example for AbraFlexi",
    "cs": "Java App Example for AbraFlexi"
  },
  "executable": "java"
}
```

## 🔨 Building

### Development Build

```bash
mvn clean compile
```

### Production Build

```bash
mvn clean package
```

### Run Tests

```bash
mvn test
```

### Generate Documentation

```bash
mvn javadoc:javadoc
```

## 📁 Project Structure

```
MultiFlexi-Java-App-Example/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── vitexsoftware/
│                   └── example/
│                       └── ExampleApp.java     # Main application class
├── multiflexi/
│   └── abraflexi_java_app.multiflexi.app.json # MultiFlexi configuration
├── target/                                      # Compiled classes and JARs
├── pom.xml                                     # Maven configuration
├── LICENSE                                     # MIT License
├── README.md                                   # This file
└── WARP.md                                     # Working AI Reference
```

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

### Development Guidelines

- Follow Java coding conventions
- Add tests for new functionality
- Update documentation as needed
- Ensure all tests pass before submitting PR

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🏢 About Vitex Software

This project is developed and maintained by [Vitex Software](https://vitexsoftware.com).

- **Website**: <https://vitexsoftware.com>
- **GitHub**: <https://github.com/VitexSoftware>
- **Contact**: <info@vitexsoftware.cz>

## 🔗 Related Projects

- [MultiFlexi Core](https://github.com/VitexSoftware/php-vitexsoftware-multiflexi-core) - The main MultiFlexi framework
- [AbraFlexi](https://github.com/VitexSoftware/AbraFlexi) - PHP library for AbraFlexi integration

---

**Happy coding! 🚀**
