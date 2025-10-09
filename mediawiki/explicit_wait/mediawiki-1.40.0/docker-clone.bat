docker volume create mediawiki-1400_images-modifiable
docker run --rm -v mediawiki-1400_images-protectedpage:/from -v mediawiki-1400_images-modifiable:/to alpine sh -c "cd /from && cp -a . /to"

docker volume create mediawiki-1400_db-modifiable
docker run --rm -v mediawiki-1400_db-protectedpage:/from -v mediawiki-1400_db-modifiable:/to alpine sh -c "cd /from && cp -a . /to"