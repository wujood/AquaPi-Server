app="aquapi_server"

docker stop "$app" && docker rm -f "$app"
docker build -t aquapi_server .
docker run -it --name "aquapi_server" -p 18080:8080 -d aquapi_server
