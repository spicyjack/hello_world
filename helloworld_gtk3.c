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
  g_print ("created window object\n");
  label = gtk_label_new ("Hello GNOME!");
  g_print ("created label object\n");
  gtk_container_add (GTK_CONTAINER (window), label);
  gtk_window_set_title (GTK_WINDOW (window), "Welcome to GNOME");
  gtk_window_set_default_size (GTK_WINDOW (window), 200, 100);
  g_print ("calling gtk_widget_show_all\n");
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
  g_print ("calling g_application_run\n");
  status = g_application_run (G_APPLICATION (app), argc, argv);
  g_object_unref (app);

  g_print ("exiting application with status: %i\n", status);
  return status;
}
