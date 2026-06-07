# Compile and Run script for Non-Immigrant VISA Application Portal

# Ensure output directory exists
if (-not (Test-Path -Path "bin")) {
    New-Item -ItemType Directory -Path "bin" -Force
}

Write-Host "Compiling Java Swing Visa Application..." -ForegroundColor Cyan

# Find all Java source files
$javaFiles = Get-ChildItem -Path "src" -Filter *.java -Recurse | ForEach-Object { $_.FullName }

# Compile classes with SQLite JDBC in classpath
javac -cp "lib/sqlite-jdbc.jar" -d bin -encoding UTF-8 $javaFiles

if ($LASTEXITCODE -eq 0) {
    Write-Host "Compilation Successful!" -ForegroundColor Green
    Write-Host "Launching Application..." -ForegroundColor Cyan
    # Run application with SQLite JDBC in classpath and enable native access for unnamed modules
    java --enable-native-access=ALL-UNNAMED -cp "bin;lib/sqlite-jdbc.jar" com.visa.app.Main
} else {
    Write-Host "Compilation Failed with exit code $LASTEXITCODE." -ForegroundColor Red
}
