clear
rm -rf __prod-ll
mkdir __prod-ll
echo ""
echo "Compiling and Running Java Program..."
javac -d ./__prod-ll LinkedList.java
echo ""
echo "----------------------------------------------------------------------------------------------------------------------------------------------------------------"
echo ""
java -cp ./__prod-ll LinkedList