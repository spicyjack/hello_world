
CC = gcc

CFLAGS = -Wall			 	\
	-DG_DISABLE_DEPRECATED 	 	\
	-DGDK_DISABLE_DEPRECATED 	\
	-DGDK_PIXBUF_DISABLE_DEPRECATED \
	-DGTK_DISABLE_DEPRECATED

helloworld: helloworld.c 
	$(CC) helloworld.c -o helloworld $(CFLAGS) `pkg-config gtk+-2.0 --cflags --libs`

hello-fltk: hello-fltk.cxx
	g++ -Wall -O3 -lfltk -o hello-fltk hello-fltk.cxx
clean: 
	rm -f *.o helloworld
