def clone(String url,String branch){
	echo "Cloning the code from the Git"
	git url: "${url}" , branch:"${branch}"
	echo 'Cloning is Successful'
}
