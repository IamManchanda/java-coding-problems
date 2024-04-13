clear
rm -rf __prod
mkdir __prod
echo ""
echo "Compiling and Running Java Program..."
javac -d ./__prod Main.java
echo ""
echo "----------------------------------------------------------------------------------------------------------------------------------------------------------------"
echo ""
java -cp ./__prod Main