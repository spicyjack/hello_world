// from https://developer.gnome.org/gnome-devel-demos/unstable/hello-world.c.html.en
// to compile:
// export PKG_CONFIG_PATH=/usr/local/lib/pkgconfig/:/opt/X11/lib/pkgconfig/
// gcc helloworld_gtk3.c `pkg-config --cflags --libs gtk+-3.0` \
//      -o helloworld_gtk3

#include <gtk/gtk.h>

static void
activate (GtkApplication* app,
          gpointer        user_data)
{
  GtkWidget *window;
  GtkWidget *label;

  window = gtk_application_window_new (app);
  label = gtk_label_new ("Hello GNOME!");
  gtk_container_add (GTK_CONTAINER (window), label);
  gtk_window_set_title (GTK_WINDOW (window), "Welcome to GNOME");
  gtk_window_set_default_size (GTK_WINDOW (window), 200, 100);
  gtk_widget_show_all (window);
}

int
main (int    argc,
      char **argv)
{
  GtkApplication *app;
  int status;

  app = gtk_application_new (NULL, G_APPLICATION_FLAGS_NONE);
  g_signal_connect (app, "activate", G_CALLBACK (activate), NULL);
  status = g_application_run (G_APPLICATION (app), argc, argv);
  g_object_unref (app);

  return status;
}
