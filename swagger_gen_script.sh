#!/bin/sh
NO_ARGUMENT_PROMPT="Please pass one of the following arguments:\n\tj = generate java server\n\tp = generate python client"
if [ -z $1 ]; then
	echo $NO_ARGUMENT_PROMPT
	exit 1
fi

if [ $1 = "j" ]; then
	if [ -d Server/src/main/java/io/swagger/api/impl_old ]; then
		echo "WARNING! A folder 'impl_old' already exists. Make sure you check your 'impl'- and 'impl_old' folder, so that your progress wont be overwritten"
	else
		if [ -d Server/src/main/java/io/swagger/api/impl ]; then
			mv Server/src/main/java/io/swagger/api/impl Server/src/main/java/io/swagger/api/impl_old
		fi
		java -jar $HOME/swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -l jaxrs -i swagger.json -o ./Server/
	fi
elif [ $1 = "p" ]; then
	if [ -d Client_old ]; then
		echo "WARNING! A folder 'Client_old' already exists. Make sure you check your 'Client'- and 'Client_old' folder, so that your progress wont be overwritten"
	else
		if [ -d Client ]; then
			mv Client Client_old
		fi
		java -jar $HOME/swagger-codegen/modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate -l python -i swagger.json -o ./Client/
	fi
else
	echo $NO_ARGUMENT_PROMPT
fi
